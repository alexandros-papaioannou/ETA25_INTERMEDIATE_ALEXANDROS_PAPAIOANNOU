package utils.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

import java.io.*;

public class LoggerUtility {

    private static final String allLogsPath = "target/logs/suite/";
    private static final String consolidatedLogsPath = "target/logs/";

    private static final Logger logger = LogManager.getLogger();

    public static synchronized void startTestCase(String testName) {
        ThreadContext.put("threadName", testName);
        logger.info("############## Execution started: " + testName + " ##############");
    }

    public static synchronized void endTestCase(String testName) {
        logger.info("############## Execution finished: " + testName + " ##############");
    }

    public static synchronized void infoLog(String message) {
        logger.info(Thread.currentThread().getName() + ":" + getExecutionInfo() + message);
    }

    public static synchronized void errorLog(String message) {
        logger.error(Thread.currentThread().getName() + ":" + getExecutionInfo() + message);
    }

    private static synchronized String getExecutionInfo() {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return className + ":" + methodName + " ====> ";
    }

    public static void mergeLogs() {
        File file = new File(allLogsPath);
        String[] fileNames = file.list();

        try {
            PrintWriter pw = new PrintWriter(consolidatedLogsPath + "ConsolidatedLogs.log");

            for (String fileName : fileNames) {
                System.out.println("Reading from " + fileName);
                File f = new File(file, fileName);
                BufferedReader br = new BufferedReader(new FileReader(f));
                pw.println("Contents of file " + fileName);
                String line = br.readLine();
                while (line != null) {
                    pw.println(line);
                    line = br.readLine();
                }
                pw.flush();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFIle = "This is log file. \n\n";

    public static ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {
    }

    public void addLogInfo(String logInfo) {
        logFIle += logInfo + "\n";
    }

    public void showLog() {
        System.out.println(logFIle);
    }
}

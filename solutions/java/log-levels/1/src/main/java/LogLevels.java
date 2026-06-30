public class LogLevels {
    
    public static String message(String logLine) {
        int openBracket = logLine.indexOf(":");
        String log = logLine.substring(openBracket+1,logLine.length());
        return log.trim();
    }

    public static String logLevel(String logLine) {
        int openBracket = logLine.indexOf(":");
        String log = logLine.substring(1,openBracket-1);
        return log.toLowerCase();
    }

    public static String reformat(String logLine) {

        int openBracket = logLine.indexOf(":");
        String msg = logLine.substring(openBracket+1,logLine.length());
        String logType = logLine.substring(1,openBracket-1);
        logType=logType.toLowerCase();

        return msg.trim() + " ("+logType+")";
    
    }
}

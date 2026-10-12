/** 日志输出入口。后续可在此加入输入校验与输出处理。 */
public class Logger {
    public void log(LogEntry entry) {
        // TODO: 处理 null 等异常输入，并输出 entry.format()。
        if (entry == null) {  throw new IllegalArgumentException("异常输入") ;}
        System.out.println(entry.format());
    }
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log(new InfoLog("This is an info message."));
        logger.log(new ErrorLog("This is an error message."));
        // TODO: 自行创建不同类型的日志对象并调用 log，验证多态行为。
    }
}

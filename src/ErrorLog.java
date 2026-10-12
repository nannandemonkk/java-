/** 错误日志。请自行实现级别与格式化规则。 */
public class ErrorLog extends LogEntry {
    public ErrorLog(String message) {
        super(message);
    }

    @Override
    public String getLevel() {
        // TODO: 返回本类对应的日志级别。
        return "";
    }

    @Override
    public String format() {
        // TODO: 使用时间、级别和消息构造输出文本。
        return "";
    }
}

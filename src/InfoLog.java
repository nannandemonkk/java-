/** 普通信息日志。请自行实现级别与格式化规则。 */
public class InfoLog extends LogEntry {
    public InfoLog(String message) {
        super(message);
    }

    @Override
    public String getLevel() {
        // TODO: 返回本类对应的日志级别。
        return "INFO";
    }

    @Override
    public String format() {
        // TODO: 使用时间、级别和消息构造输出文本。
        return getCreatedAt() + " [" + getLevel() + "] " + getMessage();
    }
}

import java.time.LocalDateTime;

/** 日志记录的抽象基类。请自行补全构造器、访问方法和格式化逻辑。 */
public abstract class LogEntry {
    private final LocalDateTime createdAt;
    private final String message;

    protected LogEntry(String message) {
        // TODO: 保存创建时间，并处理消息输入。
        this.createdAt = LocalDateTime.now();
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getMessage() {
        return message;
    }

    /** 子类负责提供日志级别。 */
    public abstract String getLevel();

    /** 子类负责定义日志的显示格式。 */
    public abstract String format();
}

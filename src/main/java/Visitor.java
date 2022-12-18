import java.util.Map;

public interface Visitor<T> {
    Map<String,String> onSignature(Task<T> task);
    void onGroupStart(Task<T> task);
    void onGroupEnd(Task<T> task);
    public void stamp();
}

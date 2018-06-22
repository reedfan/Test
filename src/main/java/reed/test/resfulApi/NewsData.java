package reed.test.resfulApi;

import java.util.List;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/6/22
 * @time 11:54
 */
public class NewsData {
    private int error_code;
    private String reason;
    private List<News> result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<News> getResult() {
        return result;
    }

    public void setResult(List<News> result) {
        this.result = result;
    }
}

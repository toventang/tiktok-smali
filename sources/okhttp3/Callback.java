package okhttp3;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public interface Callback {
    static {
        Covode.recordClassIndex(106124);
    }

    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, Response response);
}

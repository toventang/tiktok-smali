package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.core.d.d;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(705);
    }

    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, androidx.core.d.a aVar) {
        Object obj;
        int i2 = Build.VERSION.SDK_INT;
        if (aVar != null) {
            try {
                obj = aVar.c();
            } catch (Exception e2) {
                if (e2 instanceof OperationCanceledException) {
                    throw new d();
                }
                throw e2;
            }
        } else {
            obj = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }
}

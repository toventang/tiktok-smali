package com.d.a.a.a.h.a;

import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: d  reason: collision with root package name */
    public a f46432d;

    /* renamed from: e  reason: collision with root package name */
    protected final AbstractC1155b f46433e;

    public interface a {
        static {
            Covode.recordClassIndex(28344);
        }

        void a();
    }

    /* renamed from: com.d.a.a.a.h.a.b$b  reason: collision with other inner class name */
    public interface AbstractC1155b {
        static {
            Covode.recordClassIndex(28345);
        }

        JSONObject a();

        void a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(28343);
    }

    public b(AbstractC1155b bVar) {
        this.f46433e = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f46432d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}

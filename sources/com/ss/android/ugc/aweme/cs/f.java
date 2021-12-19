package com.ss.android.ugc.aweme.cs;

import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f79052a;

    /* renamed from: b  reason: collision with root package name */
    private final String f79053b;

    /* renamed from: c  reason: collision with root package name */
    private final File f79054c;

    /* renamed from: d  reason: collision with root package name */
    private final String f79055d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f79056e;

    static {
        Covode.recordClassIndex(49076);
    }

    f(Throwable th, String str, File file, String str2, boolean z) {
        this.f79052a = th;
        this.f79053b = str;
        this.f79054c = file;
        this.f79055d = str2;
        this.f79056e = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int lastIndexOf;
        Throwable th = this.f79052a;
        String str = this.f79053b;
        File file = this.f79054c;
        String str2 = this.f79055d;
        boolean z = this.f79056e;
        String a2 = e.a(th);
        if (a2 != null) {
            if (str != null) {
                int lastIndexOf2 = str.lastIndexOf(File.separator);
                a2 = ((lastIndexOf2 <= 0 || lastIndexOf2 >= str.length()) ? str : str.substring(lastIndexOf2 + 1)) + '#' + a2;
            }
            if (file != null) {
                file.getAbsolutePath();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stack", a2);
            String name = file.getName();
            String substring = (name == null || (lastIndexOf = name.lastIndexOf(46)) <= 0) ? null : name.substring(lastIndexOf);
            if (!TextUtils.isEmpty(substring)) {
                jSONObject.put(StringSet.name, substring);
            }
            if (z) {
                jSONObject.put("data_uri", file.getAbsolutePath());
            }
            jSONObject.put("call_type", str == null ? "1" : "0");
            b.a(str2, jSONObject);
        }
        return null;
    }
}

package com.bytedance.ttnet.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f44647a;

    /* renamed from: b  reason: collision with root package name */
    private static List<b> f44648b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private static ReentrantReadWriteLock f44649c;

    /* renamed from: d  reason: collision with root package name */
    private static Lock f44650d;

    /* renamed from: e  reason: collision with root package name */
    private static Lock f44651e = f44649c.writeLock();

    /* renamed from: com.bytedance.ttnet.utils.a$a  reason: collision with other inner class name */
    public static class C1091a {

        /* renamed from: a  reason: collision with root package name */
        public int f44652a;

        /* renamed from: b  reason: collision with root package name */
        public String f44653b;

        static {
            Covode.recordClassIndex(27301);
        }
    }

    static {
        Covode.recordClassIndex(27300);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f44649c = reentrantReadWriteLock;
        f44650d = reentrantReadWriteLock.readLock();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Pattern f44654a;

        static {
            Covode.recordClassIndex(27302);
        }

        public final boolean a(String str) {
            try {
                this.f44654a = Pattern.compile(str);
                return true;
            } catch (PatternSyntaxException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    public static void a(SharedPreferences sharedPreferences) {
        JSONArray jSONArray;
        int i2 = sharedPreferences.getInt("ttnet_response_verify_enabled", -1);
        String string = sharedPreferences.getString("ttnet_response_verify", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONArray = new JSONArray(string);
            } catch (Throwable unused) {
            }
            a(i2, jSONArray);
        }
        jSONArray = null;
        a(i2, jSONArray);
    }

    /* JADX INFO: finally extract failed */
    public static boolean a(URI uri) {
        try {
            f44650d.lock();
            for (b bVar : f44648b) {
                if (uri != null && !TextUtils.isEmpty(uri.getHost())) {
                    if (bVar.f44654a != null) {
                        String host = uri.getHost();
                        if (!TextUtils.isEmpty(uri.getPath())) {
                            host = host + uri.getPath();
                        }
                        if (bVar.f44654a.matcher(host).matches()) {
                            f44650d.unlock();
                            return true;
                        }
                    }
                }
            }
            f44650d.unlock();
            return false;
        } catch (Throwable th) {
            f44650d.unlock();
            throw th;
        }
    }

    public static void a(int i2, JSONArray jSONArray) {
        if (i2 > 0) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    String optString = jSONArray.optString(i3);
                    if (!TextUtils.isEmpty(optString)) {
                        b bVar = new b();
                        if (bVar.a(optString)) {
                            arrayList.add(bVar);
                        }
                    }
                }
                try {
                    f44651e.lock();
                    f44648b = arrayList;
                } finally {
                    f44651e.unlock();
                }
            }
            f44647a = true;
            return;
        }
        f44647a = false;
    }
}

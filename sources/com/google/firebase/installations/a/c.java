package com.google.firebase.installations.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.b;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final File f54533a;

    /* renamed from: b  reason: collision with root package name */
    private final b f54534b;

    static {
        Covode.recordClassIndex(33836);
    }

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR;

        static {
            Covode.recordClassIndex(33837);
        }
    }

    private JSONObject b() {
        MethodCollector.i(11596);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        FileInputStream fileInputStream = new FileInputStream(this.f54533a);
        while (true) {
            try {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    try {
                        fileInputStream.close();
                        MethodCollector.o(11596);
                        return jSONObject;
                    } catch (IOException | JSONException unused) {
                        JSONObject jSONObject2 = new JSONObject();
                        MethodCollector.o(11596);
                        return jSONObject2;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        MethodCollector.o(11596);
        throw th;
    }

    public final d a() {
        JSONObject b2 = b();
        String optString = b2.optString("Fid", null);
        int optInt = b2.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b2.optString("AuthToken", null);
        String optString3 = b2.optString("RefreshToken", null);
        long optLong = b2.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b2.optLong("ExpiresInSecs", 0);
        return d.n().a(optString).a(a.values()[optInt]).b(optString2).c(optString3).b(optLong).a(optLong2).d(b2.optString("FisError", null)).a();
    }

    private static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public c(b bVar) {
        this.f54533a = new File(a(bVar.a()), "PersistedInstallation." + bVar.h() + ".json");
        this.f54534b = bVar;
    }

    public final d a(d dVar) {
        MethodCollector.i(11754);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.a());
            jSONObject.put("Status", dVar.b().ordinal());
            jSONObject.put("AuthToken", dVar.c());
            jSONObject.put("RefreshToken", dVar.d());
            jSONObject.put("TokenCreationEpochInSecs", dVar.f());
            jSONObject.put("ExpiresInSecs", dVar.e());
            jSONObject.put("FisError", dVar.g());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", a(this.f54534b.a()));
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f54533a)) {
                MethodCollector.o(11754);
                return dVar;
            }
            IOException iOException = new IOException("unable to rename the tmpfile to PersistedInstallation");
            MethodCollector.o(11754);
            throw iOException;
        } catch (IOException | JSONException unused) {
        }
    }
}

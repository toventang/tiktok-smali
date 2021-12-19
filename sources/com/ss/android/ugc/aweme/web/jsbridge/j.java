package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.graphics.Bitmap;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.utils.ag;
import com.ss.android.ugc.aweme.utils.cs;
import java.io.File;
import org.json.JSONObject;

final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h f145042a;

    /* renamed from: b  reason: collision with root package name */
    private final int f145043b;

    static {
        Covode.recordClassIndex(94832);
    }

    j(h hVar, int i2) {
        this.f145042a = hVar;
        this.f145043b = i2;
    }

    @Override // b.g
    public final Object then(i iVar) {
        Bitmap.CompressFormat compressFormat;
        String str;
        h hVar = this.f145042a;
        int i2 = this.f145043b;
        Object obj = "";
        if (iVar.d() == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            jSONObject.put("file_path", obj);
            return jSONObject;
        }
        if (i2 == 1) {
            compressFormat = Bitmap.CompressFormat.PNG;
            str = ".png";
        } else if (i2 != 2) {
            compressFormat = Bitmap.CompressFormat.JPEG;
            str = ".jpg";
        } else {
            compressFormat = Bitmap.CompressFormat.WEBP;
            str = ".webp";
        }
        Context context = hVar.f145033a.get();
        if (context == null) {
            return null;
        }
        if (d.f107195c == null || !d.f107197e) {
            d.f107195c = context.getFilesDir();
        }
        File file = new File(d.f107195c.getAbsolutePath() + File.separator + com.bytedance.helios.sdk.d.j.f30896b, "share_" + System.currentTimeMillis() + str);
        cs.a(file.getAbsolutePath(), true);
        boolean a2 = ag.a((Bitmap) iVar.d(), file, 100, compressFormat);
        ((Bitmap) iVar.d()).recycle();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", a2 ? 1 : 0);
        if (a2) {
            obj = file.getAbsoluteFile();
        }
        jSONObject2.put("file_path", obj);
        return jSONObject2;
    }
}

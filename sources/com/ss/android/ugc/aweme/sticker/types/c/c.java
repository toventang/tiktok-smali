package com.ss.android.ugc.aweme.sticker.types.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f136069a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(88882);
    }

    public static final class a extends a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f136070a;

        static {
            Covode.recordClassIndex(88883);
        }

        a(String str) {
            this.f136070a = str;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.f136070a);
            q.a("effect_watermark_download_rate", 0, jSONObject);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.f136070a);
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = null;
            }
            jSONObject.put("exception", str);
            q.a("effect_watermark_download_rate", 1, jSONObject);
        }
    }

    static String a(Effect effect) {
        if (!TextUtils.isEmpty(effect.getExtra())) {
            try {
                return new JSONObject(effect.getExtra()).optString("watermark_for_captured_image");
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        } else {
            throw new IllegalArgumentException("extra cannot be null: stickerId" + effect.getId());
        }
    }
}

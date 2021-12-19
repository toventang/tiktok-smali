package com.bytedance.android.livesdk.chatroom.g;

import android.content.DialogInterface;
import android.net.Uri;
import com.bytedance.android.livesdk.aw;
import com.bytedance.android.livesdk.chatroom.c.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f15552a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(8597);
    }

    public static final class a implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataChannel f15553a;

        static {
            Covode.recordClassIndex(8598);
        }

        public a(DataChannel dataChannel) {
            this.f15553a = dataChannel;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f15553a.b(aw.class, new z());
        }
    }

    public static int a(Uri uri, String str, int i2) {
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) {
            return i2;
        }
        return Integer.parseInt(queryParameter);
    }

    public static String a(Uri uri, String str, String str2) {
        String queryParameter;
        return (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) ? str2 : queryParameter;
    }
}

package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.d;
import com.bytedance.android.live.broadcast.f;
import com.bytedance.android.live.broadcast.model.i;
import com.bytedance.android.live.broadcast.model.k;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Map;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f8280a = new r();

    private r() {
    }

    static {
        Covode.recordClassIndex(4209);
    }

    static final class a extends m implements h.f.a.b<i, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ DataChannel $dataChannel;

        static {
            Covode.recordClassIndex(4210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, DataChannel dataChannel) {
            super(1);
            this.$context = context;
            this.$dataChannel = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i iVar) {
            l.d(iVar, "");
            r.a(this.$context, this.$dataChannel);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Map<String, ? extends i.a>, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ DataChannel $dataChannel;

        static {
            Covode.recordClassIndex(4211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, DataChannel dataChannel) {
            super(1);
            this.$context = context;
            this.$dataChannel = dataChannel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, ? extends i.a> map) {
            l.d(map, "");
            r.a(this.$context, this.$dataChannel);
            return z.f158842a;
        }
    }

    public static final class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataChannel f8281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8282b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f8283c;

        static {
            Covode.recordClassIndex(4212);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
        }

        public final void onClick(View view) {
            l.d(view, "");
            DataChannel dataChannel = this.f8281a;
            String str = this.f8282b;
            l.b(str, "");
            d a2 = u.a(dataChannel, str);
            if (a2 != null) {
                com.bytedance.android.live.core.widget.a.a(com.bytedance.android.live.core.f.a.b(this.f8283c), a2);
            }
            DataChannel dataChannel2 = this.f8281a;
            String str2 = this.f8282b;
            l.b(str2, "");
            u.b(dataChannel2, str2);
        }

        c(DataChannel dataChannel, String str, Context context) {
            this.f8281a = dataChannel;
            this.f8282b = str;
            this.f8283c = context;
        }
    }

    public static void a(Context context, DataChannel dataChannel) {
        i.a aVar;
        int i2;
        i.a aVar2;
        Object b2 = dataChannel.b(x.class);
        if (b2 == null) {
            l.b();
        }
        String modeFromServer = ((com.bytedance.android.livesdkapi.depend.model.live.i) b2).getModeFromServer();
        Map map = (Map) dataChannel.b(com.bytedance.android.live.broadcast.z.class);
        if (map == null || (aVar = (i.a) map.get(modeFromServer)) == null || aVar.f7922h != 2) {
            dataChannel.c(f.class, new k(com.bytedance.android.live.broadcast.model.l.COLD_DOWN_BLOCK));
            return;
        }
        Map map2 = (Map) dataChannel.b(com.bytedance.android.live.broadcast.z.class);
        if (map2 == null || (aVar2 = (i.a) map2.get(modeFromServer)) == null) {
            i2 = 0;
        } else {
            i2 = aVar2.f7919e;
        }
        SpannableString spannableString = new SpannableString(y.a(R.plurals.fv, i2, Integer.valueOf(i2)));
        spannableString.setSpan(new c(dataChannel, modeFromServer, context), 0, spannableString.length(), 17);
        dataChannel.c(f.class, new k(0, com.bytedance.android.live.broadcast.model.l.COLD_DOWN_BLOCK, spannableString));
    }
}

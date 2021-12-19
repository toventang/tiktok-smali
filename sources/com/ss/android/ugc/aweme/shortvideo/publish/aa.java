package com.ss.android.ugc.aweme.shortvideo.publish;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.publish.z;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;

public final class aa implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f129685a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishEditModel f129686b;

    static {
        Covode.recordClassIndex(85140);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f129687a;

        static {
            Covode.recordClassIndex(85141);
        }

        a(String str) {
            this.f129687a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            new com.ss.android.ugc.aweme.tux.a.i.a(c.f115622a).a(this.f129687a).a();
            return z.f158842a;
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f129688a = new b();

        static {
            Covode.recordClassIndex(85142);
        }

        b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            new com.ss.android.ugc.aweme.tux.a.i.a(c.f115622a).a(R.string.blt).a();
            return z.f158842a;
        }
    }

    private final void a(boolean z) {
        String str;
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        bVar.a("enter_from", this.f129686b.enterFrom);
        bVar.a("shoot_way", this.f129686b.mShootWay);
        bVar.a("prop_list", this.f129686b.mStickerID);
        bVar.a("prop_selected_from", this.f129686b.getPropSource());
        bVar.a("content_type", es.c(this.f129686b));
        if (z) {
            str = "succeed";
        } else {
            str = "failed";
        }
        bVar.a("status", str);
        g.a().I().a("prop_pic_toast_show", bVar.f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.f
    public final void a(List<z.b> list) {
        String string;
        l.d(list, "");
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                string = list.get(0).f129918c;
            } else {
                string = this.f129685a.getString(R.string.bls);
                l.b(string, "");
            }
            i.b(new a(string), i.f4826c);
            a(true);
            return;
        }
        i.b(b.f129688a, i.f4826c);
        a(false);
    }

    public aa(Context context, VideoPublishEditModel videoPublishEditModel) {
        l.d(context, "");
        l.d(videoPublishEditModel, "");
        this.f129685a = context;
        this.f129686b = videoPublishEditModel;
    }
}

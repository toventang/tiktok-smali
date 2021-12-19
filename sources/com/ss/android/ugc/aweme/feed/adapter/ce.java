package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.ag;
import androidx.lifecycle.u;
import com.bytedance.common.utility.collection.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.i.f;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.x.ad;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.playerkit.videoview.k;
import h.f.b.l;
import java.util.WeakHashMap;
import org.json.JSONObject;

public interface ce extends ag, u<b>, c.AbstractC1481c, ah, ai, aj, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b, g, k {
    public static final a aK = a.f91762c;

    static {
        Covode.recordClassIndex(57767);
    }

    void a(View.OnTouchListener onTouchListener);

    void a(Video video);

    void a(LongPressLayout.a aVar);

    void a(boolean z, int i2);

    View al();

    JSONObject ap();

    boolean aq();

    double ar();

    DataCenter at();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final WeakHashMap<Context, d<SurfaceView>> f91760a = new WeakHashMap<>();

        /* renamed from: b  reason: collision with root package name */
        static final WeakHashMap<Context, d<ce>> f91761b = new WeakHashMap<>();

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ a f91762c = new a();

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.ce$a$a  reason: collision with other inner class name */
        public static final class C2214a implements LongPressLayout.a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2214a f91763a = new C2214a();

            static {
                Covode.recordClassIndex(57769);
            }

            C2214a() {
            }

            @Override // com.ss.android.ugc.aweme.feed.ui.LongPressLayout.a
            public final void a(float f2, float f3) {
            }
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(57768);
        }

        /* access modifiers changed from: package-private */
        public static final class b implements LongPressLayout.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BaseFeedPageParams f91764a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f91765b;

            static {
                Covode.recordClassIndex(57770);
            }

            b(BaseFeedPageParams baseFeedPageParams, Context context) {
                this.f91764a = baseFeedPageParams;
                this.f91765b = context;
            }

            @Override // com.ss.android.ugc.aweme.feed.ui.LongPressLayout.a
            public final void a(float f2, float f3) {
                String str;
                Boolean isPlayListCleanMode = this.f91764a.isPlayListCleanMode();
                l.b(isPlayListCleanMode, "");
                if (!isPlayListCleanMode.booleanValue()) {
                    if (this.f91764a.eventType == null) {
                        str = "";
                    } else {
                        str = this.f91764a.eventType;
                    }
                    l.b(str, "");
                    if (ad.a(str)) {
                        com.ss.android.ugc.d.a.c.a(new f(this.f91764a.awemeFromPage, f2, f3, this.f91765b.hashCode()));
                    }
                }
            }
        }
    }
}

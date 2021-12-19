package com.bytedance.android.live.liveinteract.multilive.a.h;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.c;
import com.bytedance.android.live.liveinteract.multilive.a.a.i;
import com.bytedance.android.live.liveinteract.multilive.e.d;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.n.w;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class a extends com.bytedance.android.live.liveinteract.multilive.e.a {
    static {
        Covode.recordClassIndex(6260);
    }

    private final d f() {
        View view;
        FrameLayout e2 = e();
        if (e2 != null && e2.getChildCount() == 0) {
            return null;
        }
        FrameLayout e3 = e();
        if (e3 != null) {
            view = e3.getChildAt(0);
        } else {
            view = null;
        }
        if (view instanceof d) {
            return (d) view;
        }
        return null;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.h.a$a  reason: collision with other inner class name */
    static final class C0229a extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(6261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0229a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.a(bool.booleanValue());
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
    }

    public final void a(boolean z) {
        d f2 = f();
        if (f2 != null) {
            f2.a(Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final void b(boolean z) {
        super.b(z);
        d f2 = f();
        if (f2 != null) {
            f2.f11821c = z;
        }
    }

    public final void a(int i2) {
        c a2 = c.a();
        l.b(a2, "");
        T t = a2.n;
        if (t == null || t.intValue() != 2) {
            if (!LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(y.e(), com.bytedance.android.livesdk.utils.b.LINK_MIC);
                return;
            }
            h.f11965b = "plus_button";
            this.f11788i.c(com.bytedance.android.live.liveinteract.multilive.a.a.h.class, new i(i2));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        super.a(viewGroup);
        l();
        this.f11788i.a(this, com.bytedance.android.live.liveinteract.multilive.c.c.class, new C0229a(this)).b(w.class, (h.f.a.b) new b(this));
    }

    static final class b extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(6262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == 1) {
                for (T t : this.this$0.f11787h) {
                    View findViewById = t.findViewById(R.id.c5n);
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    HSImageView hSImageView = (HSImageView) t.findViewById(R.id.c5o);
                    if (hSImageView != null) {
                        hSImageView.setVisibility(8);
                    }
                    HSImageView hSImageView2 = (HSImageView) t.findViewById(R.id.aw7);
                    if (hSImageView2 != null) {
                        hSImageView2.setBackgroundResource(0);
                        Drawable c2 = y.c(2131234682);
                        c2.setAlpha(51);
                        l.b(c2, "");
                        hSImageView2.setImageDrawable(c2);
                    }
                    LiveTextView liveTextView = (LiveTextView) t.findViewById(R.id.aw8);
                    if (liveTextView != null) {
                        liveTextView.setTextColor(Color.parseColor("#80FFFFFF"));
                    }
                }
            } else if (intValue == 2) {
                for (T t2 : this.this$0.f11787h) {
                    LinearLayout linearLayout = (LinearLayout) t2.findViewById(R.id.c5n);
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    HSImageView hSImageView3 = (HSImageView) t2.findViewById(R.id.c5o);
                    if (hSImageView3 != null) {
                        hSImageView3.setVisibility(8);
                    }
                    HSImageView hSImageView4 = (HSImageView) t2.findViewById(R.id.aw7);
                    if (hSImageView4 != null) {
                        hSImageView4.setBackgroundResource(0);
                        hSImageView4.setImageResource(2131234682);
                    }
                    LiveTextView liveTextView2 = (LiveTextView) t2.findViewById(R.id.aw8);
                    if (liveTextView2 != null) {
                        liveTextView2.setTextColor(Color.parseColor("#FFFFFF"));
                    }
                }
            } else if (intValue == 3 && com.bytedance.android.live.liveinteract.multilive.a.b()) {
                for (T t3 : this.this$0.f11787h) {
                    LinearLayout linearLayout2 = (LinearLayout) t3.findViewById(R.id.c5n);
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    HSImageView hSImageView5 = (HSImageView) t3.findViewById(R.id.c5o);
                    if (hSImageView5 != null) {
                        hSImageView5.setVisibility(0);
                    }
                }
            }
            return z.f158842a;
        }
    }
}

package com.ss.android.ugc.aweme.share.viewmodel;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.ae;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final d f124408c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final C3244a f124409d = new C3244a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final FeedPanelStateViewModel f124410a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f124411b;

    public interface b {
        static {
            Covode.recordClassIndex(81679);
        }

        void a();

        void b();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$a  reason: collision with other inner class name */
    public static final class C3244a {
        static {
            Covode.recordClassIndex(81678);
        }

        private C3244a() {
        }

        public /* synthetic */ C3244a(byte b2) {
            this();
        }

        public static a a(Context context) {
            FeedPanelStateViewModel feedPanelStateViewModel;
            l.d(context, "");
            if (context instanceof e) {
                feedPanelStateViewModel = (FeedPanelStateViewModel) ae.a((e) context, a.f124408c).a(FeedPanelStateViewModel.class);
            } else {
                feedPanelStateViewModel = null;
            }
            return new a(feedPanelStateViewModel, context, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(81677);
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        a("swipe_up_guide", bVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f124412a;

        static {
            Covode.recordClassIndex(81680);
        }

        c(b bVar) {
            this.f124412a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f124412a.a();
                } else {
                    this.f124412a.b();
                }
            }
        }
    }

    public final boolean a(String str) {
        Boolean value;
        t<Boolean> b2 = b(str);
        if (b2 == null || (value = b2.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    private final t<Boolean> b(String str) {
        FeedPanelStateViewModel feedPanelStateViewModel;
        FeedPanelStateViewModel feedPanelStateViewModel2;
        FeedPanelStateViewModel feedPanelStateViewModel3;
        FeedPanelStateViewModel feedPanelStateViewModel4;
        FeedPanelStateViewModel feedPanelStateViewModel5;
        FeedPanelStateViewModel feedPanelStateViewModel6;
        FeedPanelStateViewModel feedPanelStateViewModel7;
        FeedPanelStateViewModel feedPanelStateViewModel8;
        FeedPanelStateViewModel feedPanelStateViewModel9;
        FeedPanelStateViewModel feedPanelStateViewModel10;
        FeedPanelStateViewModel feedPanelStateViewModel11;
        FeedPanelStateViewModel feedPanelStateViewModel12;
        FeedPanelStateViewModel feedPanelStateViewModel13;
        switch (str.hashCode()) {
            case -2144360174:
                if (!str.equals("long_press_layer") || (feedPanelStateViewModel = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel.f124407m;
            case -1109403612:
                if (!str.equals("comment_panel") || (feedPanelStateViewModel2 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel2.f124397c;
            case -208635325:
                if (!str.equals("gif_share_dialog") || (feedPanelStateViewModel3 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel3.f124403i;
            case -67089052:
                if (!str.equals("upload_progress_fragment") || (feedPanelStateViewModel4 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel4.n;
            case -18099452:
                if (!str.equals("downloaded_video_share_dialog") || (feedPanelStateViewModel5 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel5.f124404j;
            case 106825951:
                if (!str.equals("download_dialog") || (feedPanelStateViewModel6 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel6.f124401g;
            case 403708324:
                if (!str.equals("share_panel") || (feedPanelStateViewModel7 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel7.f124398d;
            case 684302462:
                if (!str.equals("privacy_policy_dialog") || (feedPanelStateViewModel8 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel8.f124400f;
            case 1049683556:
                if (!str.equals("gif_download_dialog") || (feedPanelStateViewModel9 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel9.f124402h;
            case 1316323261:
                if (!str.equals("swipe_up_guide") || (feedPanelStateViewModel10 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel10.f124395a;
            case 1494381465:
                if (!str.equals("story_page") || (feedPanelStateViewModel11 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel11.f124399e;
            case 1654221230:
                if (!str.equals("login_panel") || (feedPanelStateViewModel12 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel12.f124396b;
            case 2144107035:
                if (!str.equals("follow_guide_popup") || (feedPanelStateViewModel13 = this.f124410a) == null) {
                    return null;
                }
                return feedPanelStateViewModel13.f124405k;
            default:
                return null;
        }
    }

    private a(FeedPanelStateViewModel feedPanelStateViewModel, Context context) {
        this.f124410a = feedPanelStateViewModel;
        this.f124411b = context;
    }

    public final void a(String str, b bVar) {
        t<Boolean> b2;
        if (this.f124410a != null && (this.f124411b instanceof m) && (b2 = b(str)) != null) {
            b2.observe((m) this.f124411b, new c(bVar));
        }
    }

    public final void a(String str, boolean z) {
        t<Boolean> b2 = b(str);
        if (b2 != null && (!l.a(b2.getValue(), Boolean.valueOf(z)))) {
            b2.setValue(Boolean.valueOf(z));
        }
    }

    public /* synthetic */ a(FeedPanelStateViewModel feedPanelStateViewModel, Context context, byte b2) {
        this(feedPanelStateViewModel, context);
    }
}

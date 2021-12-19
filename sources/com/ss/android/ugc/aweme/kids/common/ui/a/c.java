package com.ss.android.ugc.aweme.kids.common.ui.a;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f105921d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final String f105922b;

    /* renamed from: c  reason: collision with root package name */
    public final d f105923c;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f105924e;

    static {
        Covode.recordClassIndex(67782);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67784);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(ViewGroup viewGroup, String str, d dVar, boolean z) {
            l.d(viewGroup, "");
            l.d(str, "");
            l.d(dVar, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abx, viewGroup, false);
            l.b(a2, "");
            return new c(a2, str, dVar, z, (byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void c() {
        Aweme aweme = (Aweme) this.f76353m;
        if (aweme != null) {
            a(aweme.getVideo());
        }
    }

    private final void a(Video video) {
        String str;
        List<String> urlList;
        if (video != null) {
            if (a(video, "KidsAewmeViewHolder")) {
                this.o = true;
                return;
            }
            UrlModel cover = video.getCover();
            if (cover == null || (urlList = cover.getUrlList()) == null) {
                str = null;
            } else {
                str = (String) n.h((List) urlList);
            }
            if (hk.a(str)) {
                a(video.getCover(), "KidsAewmeViewHolder");
            } else {
                this.n.setActualImageResource(R.color.f159926j);
            }
        }
    }

    private final void a(AwemeStatistics awemeStatistics) {
        int i2 = 8;
        if (this.f105924e) {
            View view = this.itemView;
            l.b(view, "");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.c3d);
            if (linearLayout != null) {
                if (awemeStatistics != null) {
                    i2 = 0;
                }
                linearLayout.setVisibility(i2);
            }
            if (awemeStatistics != null) {
                View view2 = this.itemView;
                l.b(view2, "");
                TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.c3e);
                l.b(tuxTextView, "");
                tuxTextView.setText(b.a(awemeStatistics.getPlayCount()));
                return;
            }
            return;
        }
        View view3 = this.itemView;
        l.b(view3, "");
        LinearLayout linearLayout2 = (LinearLayout) view3.findViewById(R.id.c3d);
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    private static boolean b(Aweme aweme) {
        Boolean bool;
        String str;
        VideoMaskInfo videoMaskInfo;
        VideoMaskInfo videoMaskInfo2;
        VideoMaskInfo videoMaskInfo3;
        String str2 = null;
        if (aweme == null || (videoMaskInfo3 = aweme.getVideoMaskInfo()) == null) {
            bool = null;
        } else {
            bool = videoMaskInfo3.getShowMask();
        }
        if (!l.a((Object) bool, (Object) true)) {
            return false;
        }
        if (aweme == null || (videoMaskInfo2 = aweme.getVideoMaskInfo()) == null) {
            str = null;
        } else {
            str = videoMaskInfo2.getTitle();
        }
        if (!hk.a(str)) {
            return false;
        }
        if (!(aweme == null || (videoMaskInfo = aweme.getVideoMaskInfo()) == null)) {
            str2 = videoMaskInfo.getCancelMaskLabel();
        }
        if (hk.a(str2)) {
            return true;
        }
        return false;
    }

    public final void a(Aweme aweme) {
        int i2;
        if (aweme != null) {
            this.f76353m = aweme;
            a(aweme.getVideo());
            a(aweme.getStatistics());
        }
        View view = this.itemView;
        l.b(view, "");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.c3c);
        if (frameLayout != null) {
            if (b((Aweme) this.f76353m)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            frameLayout.setVisibility(i2);
        }
    }

    private c(View view, String str, d dVar, boolean z) {
        super(view);
        this.f105922b = str;
        this.f105923c = dVar;
        this.f105924e = z;
        this.n = (SmartImageView) view.findViewById(R.id.c3b);
        SmartImageView smartImageView = this.n;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.kids.common.ui.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f105925a;

                static {
                    Covode.recordClassIndex(67783);
                }

                {
                    this.f105925a = r1;
                }

                public final void onClick(View view) {
                    d dVar;
                    ClickAgent.onClick(view);
                    Aweme aweme = (Aweme) this.f105925a.f76353m;
                    if (aweme != null && (dVar = this.f105925a.f105923c) != null) {
                        dVar.a(view, aweme, this.f105925a.f105922b);
                    }
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 23) {
            SmartImageView smartImageView2 = this.n;
            if (smartImageView2 != null) {
                smartImageView2.setForeground(androidx.core.content.b.a(view.getContext(), (int) R.drawable.ayr));
            }
        } else {
            com.ss.android.ugc.aweme.notification.g.a.a(this.n);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.c3c);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public /* synthetic */ c(View view, String str, d dVar, boolean z, byte b2) {
        this(view, str, dVar, z);
    }
}

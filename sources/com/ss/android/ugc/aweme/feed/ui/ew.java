package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.g.e;
import androidx.lifecycle.u;
import com.a.b.c;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.feed.x.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.Arrays;

public final class ew extends g implements u<com.ss.android.ugc.aweme.arch.widgets.base.b> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f94752m = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    public View f94753l;
    private View n;

    static {
        Covode.recordClassIndex(60119);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60120);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public ew(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ew f94754a;

        static {
            Covode.recordClassIndex(60121);
        }

        b(ew ewVar) {
            this.f94754a = ewVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f94754a.f94753l;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (this.f94754a.f94768a != null) {
                d dVar = new d();
                Aweme aweme = this.f94754a.f94768a;
                l.b(aweme, "");
                r.a("tns_banner_dismiss_ktf", dVar.a("object_id", aweme.getAid()).f66730a);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(View view) {
        ViewGroup.LayoutParams layoutParams;
        TuxIconView tuxIconView;
        MethodCollector.i(8087);
        if (view instanceof FrameLayout) {
            this.n = view;
            Context context = this.f94774g;
            if (context != null) {
                View a2 = c.a((Activity) context, (int) R.layout.to);
                this.f94753l = a2;
                FrameLayout.LayoutParams layoutParams2 = null;
                if (a2 != null) {
                    layoutParams = a2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    layoutParams2 = layoutParams;
                }
                FrameLayout.LayoutParams layoutParams3 = layoutParams2;
                if (layoutParams3 != null) {
                    layoutParams3.setMargins(layoutParams3.leftMargin, layoutParams3.topMargin - i.b(), layoutParams3.rightMargin, layoutParams3.bottomMargin);
                }
                View view2 = this.f94753l;
                if (!(view2 == null || (tuxIconView = (TuxIconView) view2.findViewById(R.id.a2x)) == null)) {
                    tuxIconView.setOnClickListener(new b(this));
                }
                View view3 = this.f94753l;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                ((FrameLayout) view).addView(this.f94753l);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                MethodCollector.o(8087);
                throw nullPointerException;
            }
        }
        MethodCollector.o(8087);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        e eVar;
        TuxTextView tuxTextView;
        View view;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (bVar2 != null && this.f94768a != null) {
            String str = bVar2.f67014a;
            l.b(str, "");
            int hashCode = str.hashCode();
            if (hashCode != -330388150) {
                if (hashCode != 350216171) {
                    if (hashCode == 1628582276 && str.equals("on_page_unselected") && (view = this.f94753l) != null) {
                        view.setVisibility(8);
                    }
                } else if (str.equals("on_page_selected")) {
                    if (g.b(this.f94768a)) {
                        this.f94773f.a("action_video_on_play_progress_change", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
                    }
                    Aweme aweme = this.f94768a;
                    l.b(aweme, "");
                    KtfInfo ktfInfo = aweme.getUploadMiscInfoStruct().ktfInfo;
                    if (ktfInfo != null) {
                        l.b(ktfInfo, "");
                        ktfInfo.resetState();
                    }
                }
            } else if (str.equals("action_video_on_play_progress_change") && (eVar = (e) bVar2.a()) != null) {
                S s = eVar.f2398b;
                if (s == null) {
                    this.f94773f.b("action_video_on_play_progress_change", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
                } else if (s.doubleValue() > 2.0d) {
                    View view2 = this.f94753l;
                    if ((view2 == null || view2.getVisibility() != 0) && this.f94768a != null) {
                        Aweme aweme2 = this.f94768a;
                        l.b(aweme2, "");
                        KtfInfo ktfInfo2 = aweme2.getUploadMiscInfoStruct().ktfInfo;
                        if (ktfInfo2 != null) {
                            l.b(ktfInfo2, "");
                            String cautionLabel = ktfInfo2.getCautionLabel();
                            String a2 = com.a.a(ktfInfo2.getWarningText(), Arrays.copyOf(new Object[]{cautionLabel}, 1));
                            l.b(a2, "");
                            int a3 = p.a((CharSequence) a2, cautionLabel, 0, false, 6);
                            SpannableString spannableString = new SpannableString(a2);
                            if (a3 >= 0) {
                                spannableString.setSpan(new StyleSpan(1), a3, cautionLabel.length(), 18);
                            }
                            View view3 = this.f94753l;
                            if (!(view3 == null || (tuxTextView = (TuxTextView) view3.findViewById(R.id.a2y)) == null)) {
                                tuxTextView.setText(spannableString);
                            }
                            View view4 = this.f94753l;
                            if (view4 != null) {
                                view4.setVisibility(0);
                            }
                            d dVar = new d();
                            Aweme aweme3 = this.f94768a;
                            l.b(aweme3, "");
                            r.a("tns_banner_popout_ktf", dVar.a("object_id", aweme3.getAid()).a("enter_from", this.f94769b).f66730a);
                        }
                    }
                    this.f94773f.b("action_video_on_play_progress_change", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
                }
            }
        }
    }
}

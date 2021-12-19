package com.ss.android.ugc.aweme.tools.music.e;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;
import java.util.Locale;

public class c extends RecyclerView.ViewHolder {

    /* renamed from: e  reason: collision with root package name */
    public static final a f140578e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AVDmtImageTextView f140579a;

    /* renamed from: b  reason: collision with root package name */
    public SimpleDraweeView f140580b;

    /* renamed from: c  reason: collision with root package name */
    public AVDmtTextView f140581c;

    /* renamed from: d  reason: collision with root package name */
    public final j f140582d;

    /* renamed from: f  reason: collision with root package name */
    private Animation f140583f;

    static {
        Covode.recordClassIndex(91812);
    }

    public boolean c() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91814);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            l.d(layoutInflater, "");
            l.d(viewGroup, "");
            View a2 = com.a.a(layoutInflater, R.layout.dl, viewGroup, false);
            l.b(a2, "");
            return a2;
        }
    }

    public final void a() {
        AVDmtImageTextView aVDmtImageTextView = this.f140579a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(0.66f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f140579a;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.b(true);
        }
    }

    public final void b() {
        AVDmtImageTextView aVDmtImageTextView = this.f140579a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(1.0f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f140579a;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.b(false);
        }
    }

    public final void a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f140579a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(final View view, j jVar) {
        super(view);
        l.d(view, "");
        this.f140582d = jVar;
        this.f140579a = (AVDmtImageTextView) view.findViewById(R.id.bsa);
        this.f140580b = (SimpleDraweeView) view.findViewById(R.id.c39);
        this.f140581c = (AVDmtTextView) view.findViewById(R.id.f35);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.f140583f = alphaAnimation;
        alphaAnimation.setDuration(1000);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.tools.music.e.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f140584a;

            static {
                Covode.recordClassIndex(91813);
            }

            {
                this.f140584a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                j jVar = this.f140584a.f140582d;
                if (jVar != null) {
                    jVar.a(view, this.f140584a.getAdapterPosition());
                }
            }
        });
    }

    public void a(MusicModel musicModel, boolean z, boolean z2) {
        String str;
        boolean z3;
        String str2;
        String a2;
        String picPremium;
        String str3 = null;
        if (musicModel != null) {
            str = musicModel.getName();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            AVDmtImageTextView aVDmtImageTextView = this.f140579a;
            if (aVDmtImageTextView != null) {
                AVDmtTextView aVDmtTextView = aVDmtImageTextView.f138669b;
                if (aVDmtTextView == null) {
                    l.a("dmtTextView");
                }
                aVDmtTextView.setText("");
            }
        } else {
            AVDmtImageTextView aVDmtImageTextView2 = this.f140579a;
            if (aVDmtImageTextView2 != null) {
                if (musicModel != null) {
                    str2 = musicModel.getName();
                } else {
                    str2 = null;
                }
                aVDmtImageTextView2.setText(str2);
            }
        }
        AVDmtImageTextView aVDmtImageTextView3 = this.f140579a;
        if (aVDmtImageTextView3 != null) {
            if (musicModel == null || (picPremium = musicModel.getPicPremium()) == null || picPremium.length() == 0) {
                aVDmtImageTextView3.a(new ColorDrawable(0));
                aVDmtImageTextView3.a();
            } else {
                if (musicModel != null) {
                    str3 = musicModel.getPicPremium();
                }
                aVDmtImageTextView3.a(str3);
            }
        }
        if (c()) {
            if (musicModel != null) {
                AVDmtTextView aVDmtTextView2 = this.f140581c;
                if (aVDmtTextView2 != null) {
                    int presenterDuration = musicModel.getPresenterDuration() / 1000;
                    int i2 = presenterDuration % 60;
                    int i3 = presenterDuration / 60;
                    int i4 = i3 / 60;
                    int i5 = i3 % 60;
                    if (i4 == 0) {
                        a2 = com.a.a(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
                        l.b(a2, "");
                    } else {
                        a2 = com.a.a(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
                        l.b(a2, "");
                    }
                    aVDmtTextView2.setText(a2);
                }
                AVDmtTextView aVDmtTextView3 = this.f140581c;
                if (aVDmtTextView3 != null) {
                    aVDmtTextView3.setVisibility(0);
                }
            } else {
                AVDmtTextView aVDmtTextView4 = this.f140581c;
                if (aVDmtTextView4 != null) {
                    aVDmtTextView4.setVisibility(8);
                }
            }
        }
        a(z);
        if (musicModel == null) {
            SimpleDraweeView simpleDraweeView = this.f140580b;
            if (simpleDraweeView == null) {
                l.b();
            }
            simpleDraweeView.setVisibility(8);
        } else if (musicModel.isMvThemeMusic()) {
            SimpleDraweeView simpleDraweeView2 = this.f140580b;
            if (simpleDraweeView2 == null) {
                l.b();
            }
            simpleDraweeView2.setVisibility(0);
        } else {
            SimpleDraweeView simpleDraweeView3 = this.f140580b;
            if (simpleDraweeView3 == null) {
                l.b();
            }
            simpleDraweeView3.setVisibility(8);
        }
        if (z2) {
            AVDmtImageTextView aVDmtImageTextView4 = this.f140579a;
            if (aVDmtImageTextView4 != null) {
                aVDmtImageTextView4.a(0.66f);
            }
            AVDmtImageTextView aVDmtImageTextView5 = this.f140579a;
            if (aVDmtImageTextView5 != null) {
                aVDmtImageTextView5.b(true);
                return;
            }
            return;
        }
        AVDmtImageTextView aVDmtImageTextView6 = this.f140579a;
        if (aVDmtImageTextView6 != null) {
            aVDmtImageTextView6.a(1.0f);
        }
        AVDmtImageTextView aVDmtImageTextView7 = this.f140579a;
        if (aVDmtImageTextView7 != null) {
            aVDmtImageTextView7.b(false);
        }
    }
}

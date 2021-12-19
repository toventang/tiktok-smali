package com.ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.model.ak;
import com.ss.android.ugc.aweme.commercialize.views.bottomdialog.d;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class b extends RecyclerView.a<d> {

    /* renamed from: e  reason: collision with root package name */
    public static final C1731b f75956e = new C1731b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f75957a = -1;

    /* renamed from: b  reason: collision with root package name */
    public a f75958b;

    /* renamed from: c  reason: collision with root package name */
    public final List<ak> f75959c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f75960d;

    public interface a {
        static {
            Covode.recordClassIndex(46841);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(46840);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ d onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$b  reason: collision with other inner class name */
    public static final class C1731b {
        static {
            Covode.recordClassIndex(46842);
        }

        private C1731b() {
        }

        public /* synthetic */ C1731b(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f75959c.size();
    }

    public final void a(int i2) {
        int i3 = this.f75957a;
        if (i3 != i2) {
            if (i3 != -1) {
                notifyItemChanged(i3);
            }
            this.f75957a = i2;
            notifyItemChanged(i2);
            a aVar = this.f75958b;
            if (aVar != null) {
                aVar.a(i2);
                return;
            }
            return;
        }
        this.f75957a = -1;
        notifyItemChanged(i2);
        a aVar2 = this.f75958b;
        if (aVar2 != null) {
            aVar2.a(-1);
        }
    }

    public b(List<ak> list, boolean z) {
        l.d(list, "");
        this.f75959c = list;
        this.f75960d = z;
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(10961);
        l.d(viewGroup, "");
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aaj, viewGroup, false);
        l.b(a3, "");
        d dVar = new d(a3);
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = dVar.getClass().getName();
        MethodCollector.o(10961);
        return dVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(d dVar, int i2) {
        boolean z;
        String str;
        d dVar2 = dVar;
        l.d(dVar2, "");
        boolean z2 = this.f75960d;
        l.d(this, "");
        ak akVar = this.f75959c.get(i2);
        int i3 = 0;
        if (i2 == this.f75957a) {
            z = true;
        } else {
            z = false;
        }
        if (z2) {
            FrameLayout a2 = dVar2.a();
            if (a2 != null) {
                a2.setVisibility(0);
                TextView textView = (TextView) a2.findViewById(R.id.e4l);
                if (textView != null) {
                    textView.setText(akVar.f74860a);
                }
                ImageView imageView = (ImageView) a2.findViewById(R.id.e4j);
                if (imageView != null) {
                    if (!z) {
                        i3 = 4;
                    }
                    imageView.setVisibility(i3);
                }
            }
            LinearLayout b2 = dVar2.b();
            if (b2 != null) {
                b2.setVisibility(8);
            }
        } else {
            FrameLayout a3 = dVar2.a();
            if (a3 != null) {
                a3.setVisibility(8);
            }
            LinearLayout b3 = dVar2.b();
            if (b3 != null) {
                b3.setVisibility(0);
                TextView textView2 = (TextView) b3.findViewById(R.id.cp7);
                if (textView2 != null) {
                    textView2.setText(akVar.f74860a);
                    if (z) {
                        str = "#fe2c55";
                    } else {
                        str = "#e6161823";
                    }
                    textView2.setTextColor(Color.parseColor(str));
                }
            }
        }
        dVar2.itemView.setOnClickListener(new d.b(this, i2));
    }
}

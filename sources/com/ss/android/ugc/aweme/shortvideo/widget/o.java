package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.cover.a;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import f.a.d.f;
import h.f.b.l;
import h.p;
import java.util.Objects;

public final class o extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public p<Integer, Bitmap>[] f132944a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f132945b;

    /* renamed from: c  reason: collision with root package name */
    public int f132946c;

    /* renamed from: d  reason: collision with root package name */
    public int f132947d;

    /* renamed from: e  reason: collision with root package name */
    private p f132948e;

    /* renamed from: f  reason: collision with root package name */
    private b f132949f;

    /* renamed from: g  reason: collision with root package name */
    private int f132950g;

    /* renamed from: h  reason: collision with root package name */
    private int f132951h;

    /* renamed from: i  reason: collision with root package name */
    private int f132952i;

    static {
        Covode.recordClassIndex(86953);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public final void a() {
        this.f132949f.dispose();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f132948e.f132955a / this.f132952i;
    }

    private final int b(int i2) {
        return i2 + (this.f132947d * this.f132946c);
    }

    public final int a(int i2) {
        int i3 = this.f132946c;
        if (i2 / i3 != this.f132947d) {
            return -1;
        }
        return i2 % i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        View view = viewHolder.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        int b2 = b(i2);
        p<Integer, Bitmap>[] pVarArr = this.f132944a;
        Bitmap bitmap = null;
        if (b2 > pVarArr.length) {
            imageView.setImageBitmap(null);
        } else if (pVarArr[b(i2)] == null) {
            p<Integer, Bitmap> pVar = this.f132944a[0];
            if (pVar != null) {
                bitmap = pVar.getSecond();
            }
            imageView.setImageBitmap(bitmap);
        } else {
            p<Integer, Bitmap> pVar2 = this.f132944a[b(i2)];
            if (pVar2 != null) {
                bitmap = pVar2.getSecond();
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    public o(a aVar, int i2, int i3) {
        l.d(aVar, "");
        this.f132950g = i2;
        this.f132951h = i3;
        this.f132952i = 1;
        p pVar = new p(aVar, this.f132950g, this.f132951h, aVar.a());
        this.f132948e = pVar;
        this.f132944a = new p[pVar.f132955a];
        this.f132945b = true;
        this.f132946c = 7;
        b d2 = this.f132948e.a().d(new f(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.o.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f132953a;

            static {
                Covode.recordClassIndex(86954);
            }

            {
                this.f132953a = r1;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                p<Integer, Bitmap> pVar = (p) obj;
                this.f132953a.f132944a[pVar.getFirst().intValue()] = pVar;
                if (this.f132953a.f132945b) {
                    this.f132953a.f132945b = false;
                    this.f132953a.notifyDataSetChanged();
                } else if (this.f132953a.a(pVar.getFirst().intValue()) >= 0) {
                    o oVar = this.f132953a;
                    oVar.notifyItemChanged(oVar.a(pVar.getFirst().intValue()));
                }
            }
        });
        l.b(d2, "");
        this.f132949f = d2;
    }

    private static RecyclerView.ViewHolder a(o oVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6694);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3r, viewGroup, false);
        if (a3 != null) {
            ImageView imageView = (ImageView) a3;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = oVar.f132951h;
            layoutParams.width = oVar.f132950g;
            imageView.setLayoutParams(layoutParams);
            r rVar = new r(imageView);
            try {
                if (rVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(rVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) rVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(rVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = rVar.getClass().getName();
            MethodCollector.o(6694);
            return rVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        MethodCollector.o(6694);
        throw nullPointerException;
    }

    public /* synthetic */ o(a aVar, int i2, int i3, byte b2) {
        this(aVar, i2, i3);
    }
}

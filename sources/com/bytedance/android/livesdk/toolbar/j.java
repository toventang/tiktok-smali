package com.bytedance.android.livesdk.toolbar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p.d;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.p.l;
import com.bytedance.android.live.p.q;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    final Map<l, View> f21726a = new EnumMap(l.class);

    /* renamed from: b  reason: collision with root package name */
    final LinkedList<l> f21727b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    final Map<l, Boolean> f21728c = new EnumMap(l.class);

    /* renamed from: d  reason: collision with root package name */
    public final DataChannel f21729d;

    /* renamed from: e  reason: collision with root package name */
    List<? extends l> f21730e;

    /* renamed from: f  reason: collision with root package name */
    public final q f21731f;

    /* renamed from: g  reason: collision with root package name */
    final ConcurrentHashMap<l, f> f21732g;

    /* renamed from: h  reason: collision with root package name */
    private final LinearLayout f21733h;

    static {
        Covode.recordClassIndex(12809);
    }

    public final void a() {
        ConcurrentHashMap<l, f> concurrentHashMap = this.f21732g;
        if (concurrentHashMap != null) {
            for (Map.Entry<l, f> entry : concurrentHashMap.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void b() {
        f fVar;
        MethodCollector.i(2098);
        for (T t : this.f21727b) {
            View view = this.f21726a.get(t);
            if (view != null) {
                ConcurrentHashMap<l, f> concurrentHashMap = this.f21732g;
                if (!(concurrentHashMap == null || (fVar = concurrentHashMap.get(t)) == null)) {
                    fVar.b(view, this.f21729d);
                }
                this.f21733h.removeView(view);
                this.f21726a.remove(t);
            }
        }
        this.f21727b.clear();
        MethodCollector.o(2098);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f21734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f21735b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f21736c;

        static {
            Covode.recordClassIndex(12810);
        }

        a(j jVar, f fVar, l lVar) {
            this.f21734a = jVar;
            this.f21735b = fVar;
            this.f21736c = lVar;
        }

        public final void onClick(View view) {
            DataChannel dataChannel;
            this.f21735b.onClick(view);
            if (this.f21734a.f21731f.isPopup() && this.f21736c != l.REVERSE_CAMERA && this.f21736c != l.REVERSE_MIRROR && (dataChannel = this.f21734a.f21729d) != null) {
                dataChannel.c(d.class);
            }
        }
    }

    public final void a(l lVar) {
        f fVar;
        MethodCollector.i(2089);
        h.f.b.l.d(lVar, "");
        View view = this.f21726a.get(lVar);
        if (view == null) {
            MethodCollector.o(2089);
            return;
        }
        ConcurrentHashMap<l, f> concurrentHashMap = this.f21732g;
        if (!(concurrentHashMap == null || (fVar = concurrentHashMap.get(lVar)) == null)) {
            fVar.b(view, this.f21729d);
        }
        p.a(view);
        this.f21733h.removeView(view);
        this.f21727b.remove(lVar);
        this.f21726a.remove(lVar);
        MethodCollector.o(2089);
    }

    public final void a(l lVar, f fVar) {
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(fVar, "");
        a(lVar, fVar, true);
    }

    public final void a(l lVar, boolean z) {
        f fVar;
        View findViewById;
        int i2;
        h.f.b.l.d(lVar, "");
        View view = this.f21726a.get(lVar);
        if (!(view == null || (findViewById = view.findViewById(R.id.enq)) == null)) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        ConcurrentHashMap<l, f> concurrentHashMap = this.f21732g;
        if (concurrentHashMap != null && (fVar = concurrentHashMap.get(lVar)) != null) {
            fVar.a(z);
        }
    }

    public final void a(l lVar, f fVar, boolean z) {
        int layoutId;
        View view;
        int i2;
        LiveTextView liveTextView;
        LiveTextView liveTextView2;
        int drawable;
        Integer c2;
        MethodCollector.i(2081);
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(fVar, "");
        if (!this.f21730e.contains(lVar)) {
            MethodCollector.o(2081);
        } else if (!this.f21727b.contains(lVar) || z) {
            if (this.f21727b.contains(lVar)) {
                a(lVar);
            }
            this.f21727b.add(lVar);
            Integer layoutId2 = lVar.getLayoutId();
            if (layoutId2 != null) {
                layoutId = layoutId2.intValue();
            } else {
                layoutId = this.f21731f.getLayoutId();
            }
            if (!(lVar.getLayoutId() == null || !this.f21731f.getHasText() || (c2 = h.c(lVar)) == null)) {
                layoutId = c2.intValue();
            }
            if (!LiveLayoutPreloadSetting.INSTANCE.enable() || lVar.getLayoutId() != null || (view = m.a(this.f21733h.getContext(), this.f21731f)) == null) {
                view = p.a((ViewGroup) this.f21733h, layoutId, false);
            }
            Integer a2 = com.bytedance.android.live.p.j.a(lVar);
            if (a2 != null) {
                view.setId(a2.intValue());
            }
            if (lVar.getLayoutId() == null) {
                ImageView imageView = (ImageView) view.findViewById(R.id.enf);
                if (imageView != null) {
                    Integer rTLDrawable = lVar.getRTLDrawable();
                    if (rTLDrawable != null) {
                        drawable = rTLDrawable.intValue();
                    } else {
                        drawable = lVar.getDrawable();
                    }
                    imageView.setBackgroundResource(drawable);
                }
                if (this.f21731f.getHasTitle() && (liveTextView2 = (LiveTextView) view.findViewById(R.id.ens)) != null) {
                    liveTextView2.setText(lVar.getTitleId());
                }
                if (this.f21731f.getHasText()) {
                    Integer a3 = h.a(lVar);
                    if (a3 != null) {
                        int intValue = a3.intValue();
                        ImageView imageView2 = (ImageView) view.findViewById(R.id.enf);
                        if (imageView2 != null) {
                            imageView2.setBackgroundResource(intValue);
                        }
                    }
                    CharSequence b2 = h.b(lVar);
                    if (!(b2 == null || (liveTextView = (LiveTextView) view.findViewById(R.id.enr)) == null)) {
                        liveTextView.setText(b2);
                    }
                }
            }
            view.setOnClickListener(new a(this, fVar, lVar));
            if (lVar.isButtonVisible) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            view.setTag(lVar);
            this.f21726a.put(lVar, view);
            this.f21728c.put(lVar, false);
            view.setClickable(lVar.isEnableClick);
            a(lVar, lVar.isRedDotVisible);
            fVar.a(view, this.f21729d);
            if (lVar.getLayoutId() == null) {
                LinearLayout linearLayout = this.f21733h;
                LinkedList<l> linkedList = this.f21727b;
                ArrayList arrayList = new ArrayList();
                for (T t : linkedList) {
                    if (this.f21730e.indexOf(t) < this.f21730e.indexOf(lVar)) {
                        arrayList.add(t);
                    }
                }
                linearLayout.addView(view, arrayList.size(), this.f21731f.getLayoutParams());
                MethodCollector.o(2081);
                return;
            }
            LinearLayout linearLayout2 = this.f21733h;
            LinkedList<l> linkedList2 = this.f21727b;
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : linkedList2) {
                if (this.f21730e.indexOf(t2) < this.f21730e.indexOf(lVar)) {
                    arrayList2.add(t2);
                }
            }
            linearLayout2.addView(view, arrayList2.size());
            MethodCollector.o(2081);
        } else {
            MethodCollector.o(2081);
        }
    }

    public j(DataChannel dataChannel, LinearLayout linearLayout, List<? extends l> list, q qVar, ConcurrentHashMap<l, f> concurrentHashMap) {
        h.f.b.l.d(linearLayout, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(qVar, "");
        this.f21729d = dataChannel;
        this.f21733h = linearLayout;
        this.f21730e = list;
        this.f21731f = qVar;
        this.f21732g = concurrentHashMap;
    }
}

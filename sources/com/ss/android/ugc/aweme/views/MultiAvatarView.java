package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.g.a;
import java.util.List;

public final class MultiAvatarView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f144496a;

    /* renamed from: b  reason: collision with root package name */
    private int f144497b;

    /* renamed from: c  reason: collision with root package name */
    private int f144498c;

    /* renamed from: d  reason: collision with root package name */
    private int f144499d;

    /* renamed from: e  reason: collision with root package name */
    private int f144500e;

    static {
        Covode.recordClassIndex(94585);
    }

    public MultiAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setDigitLimit(int i2) {
        this.f144500e = i2;
    }

    public final void setMaxAvatarNumber(int i2) {
        this.f144499d = i2;
    }

    private static String a(long j2) {
        return "+" + b.a(j2);
    }

    public final void a(int i2, int i3) {
        if (!(i2 == this.f144498c && i3 == this.f144497b) && getChildCount() > 0) {
            removeAllViews();
        }
        this.f144498c = i2;
        this.f144497b = i3;
    }

    private final View a(int i2, String str) {
        MethodCollector.i(2444);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.agm, (ViewGroup) null);
        l.b(inflate, "");
        inflate.setMinimumWidth(this.f144498c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.f144498c);
        if (gb.a(inflate.getContext())) {
            layoutParams.setMargins(0, 0, this.f144497b * i2, 0);
        } else {
            layoutParams.setMargins(this.f144497b * i2, 0, 0, 0);
        }
        inflate.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.f3t);
        l.b(textView, "");
        textView.setText(str);
        MethodCollector.o(2444);
        return inflate;
    }

    private final View a(User user, int i2) {
        MethodCollector.i(2442);
        UrlModel urlModel = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aj1, (ViewGroup) null);
        int i3 = this.f144498c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        if (gb.a(inflate.getContext())) {
            layoutParams.setMargins(0, 0, this.f144497b * i2, 0);
        } else {
            layoutParams.setMargins(this.f144497b * i2, 0, 0, 0);
        }
        inflate.setLayoutParams(layoutParams);
        RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.or);
        if (user != null) {
            urlModel = user.getAvatarThumb();
        }
        e.a(remoteImageView, urlModel);
        l.b(inflate, "");
        MethodCollector.o(2442);
        return inflate;
    }

    public final void a(List<? extends User> list, long j2) {
        Number valueOf;
        int i2 = 0;
        if (!(list == null || list.isEmpty())) {
            setVisibility(0);
            removeAllViews();
            if (!this.f144496a) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    addView(a((User) list.get(size), size));
                }
            } else {
                for (T t : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (i2 < this.f144499d) {
                        addView(a((User) t2, i2));
                    }
                    i2 = i3;
                }
            }
            int size2 = list.size();
            int i4 = this.f144499d;
            if (size2 > i4 || j2 > ((long) i4)) {
                if (j2 <= ((long) i4)) {
                    valueOf = Integer.valueOf(size2);
                } else {
                    valueOf = Long.valueOf(j2);
                }
                long longValue = valueOf.longValue();
                int i5 = this.f144499d;
                addView(a(i5, a(longValue - ((long) i5))));
            }
        }
    }

    private /* synthetic */ MultiAvatarView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MultiAvatarView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(2744);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f144497b = a.a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        this.f144498c = a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
        this.f144499d = 3;
        this.f144496a = true;
        this.f144500e = 99;
        MethodCollector.o(2744);
    }
}

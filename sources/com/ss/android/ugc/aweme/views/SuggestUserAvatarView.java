package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class SuggestUserAvatarView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final a f144556b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f144557a;

    /* renamed from: c  reason: collision with root package name */
    private int f144558c;

    /* renamed from: d  reason: collision with root package name */
    private int f144559d;

    /* renamed from: e  reason: collision with root package name */
    private final int f144560e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f144561f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f144562g;

    /* renamed from: h  reason: collision with root package name */
    private int f144563h;

    /* renamed from: i  reason: collision with root package name */
    private int f144564i;

    static {
        Covode.recordClassIndex(94603);
    }

    public SuggestUserAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94604);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static float a(MutualStruct mutualStruct) {
            l.d(mutualStruct, "");
            if (mutualStruct.getTotal() > 3) {
                return 46.0f;
            }
            if (mutualStruct.getTotal() > 1) {
                return (((float) mutualStruct.getTotal()) * 20.0f) - (((float) (mutualStruct.getTotal() - 1)) * 7.0f);
            }
            return ((float) mutualStruct.getTotal()) * 20.0f;
        }
    }

    public final void setDarkMode(boolean z) {
        this.f144561f = z;
    }

    public final void setSocialVideoTag(boolean z) {
        this.f144562g = z;
    }

    public static boolean a(MutualStruct mutualStruct) {
        l.d(mutualStruct, "");
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null || !(!userList.isEmpty())) {
            return false;
        }
        return true;
    }

    public final void b(MutualStruct mutualStruct) {
        List<MutualUser> userList;
        int i2;
        l.d(mutualStruct, "");
        setVisibility(8);
        if (a(mutualStruct) && (userList = mutualStruct.getUserList()) != null) {
            setVisibility(0);
            removeAllViews();
            int size = userList.size();
            int i3 = 0;
            while (true) {
                i2 = 99;
                if (i3 >= size) {
                    break;
                } else if (userList.get(i3) != null) {
                    boolean z = true;
                    if (i3 >= userList.size() - 1 && mutualStruct.getTotal() <= userList.size()) {
                        z = false;
                    }
                    View a2 = a(userList.get(i3), i3, z);
                    if (i3 == 2) {
                        if (userList.size() == 3 && userList.size() == mutualStruct.getTotal()) {
                            addView(a(userList.get(i3), i3, false));
                        }
                    } else if (i3 >= 2) {
                        break;
                    } else {
                        addView(a2);
                        i3++;
                    }
                } else {
                    return;
                }
            }
            int total = mutualStruct.getTotal() - 2;
            if (total > 99) {
                total = 99;
            }
            addView(c(i3, total));
            if (userList.size() != 0 && userList.size() <= 2 && userList.size() < mutualStruct.getTotal()) {
                int total2 = mutualStruct.getTotal() - userList.size();
                int size2 = userList.size();
                if (total2 <= 99) {
                    i2 = total2;
                }
                addView(c(size2, i2));
            }
        }
    }

    public final void a(int i2, int i3) {
        this.f144563h = i2;
        this.f144564i = i3;
    }

    public final void b(int i2, int i3) {
        if (!(i2 == this.f144559d && i3 == this.f144558c) && getChildCount() > 0) {
            removeAllViews();
        }
        this.f144559d = i2;
        this.f144558c = i3;
    }

    private final View c(int i2, int i3) {
        View inflate;
        MethodCollector.i(2828);
        if (this.f144557a) {
            int i4 = this.f144563h;
            int i5 = this.f144564i;
            Context context = getContext();
            l.b(context, "");
            TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
            int i6 = this.f144559d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i6);
            if (gb.a(tuxTextView.getContext())) {
                layoutParams.setMargins(0, 0, this.f144558c * i2, 0);
            } else {
                layoutParams.setMargins(this.f144558c * i2, 0, 0, 0);
            }
            tuxTextView.setLayoutParams(layoutParams);
            tuxTextView.setGravity(17);
            tuxTextView.setLines(1);
            tuxTextView.setTextColor(i5);
            tuxTextView.setTuxFont(72);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics())));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            Integer valueOf3 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system3.getDisplayMetrics())));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            i.a((View) tuxTextView, valueOf, valueOf2, valueOf3, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system4.getDisplayMetrics()))), false, 16);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            if (paint != null) {
                paint.setStyle(Paint.Style.FILL);
            }
            Paint paint2 = shapeDrawable.getPaint();
            if (paint2 != null) {
                paint2.setColor(i4);
            }
            Paint paint3 = shapeDrawable.getPaint();
            if (paint3 != null) {
                paint3.setAntiAlias(true);
            }
            tuxTextView.setBackground(shapeDrawable);
            tuxTextView.setText(tuxTextView.getContext().getString(R.string.f8k, Integer.valueOf(i3)));
            MethodCollector.o(2828);
            return tuxTextView;
        }
        if (this.f144561f) {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.ag8, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.ag7, (ViewGroup) null);
        }
        int i7 = this.f144559d;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, i7);
        if (gb.a(inflate.getContext())) {
            layoutParams2.setMargins(0, 0, this.f144558c * i2, 0);
        } else {
            layoutParams2.setMargins(this.f144558c * i2, 0, 0, 0);
        }
        inflate.setLayoutParams(layoutParams2);
        TextView textView = (TextView) inflate.findViewById(R.id.f3t);
        l.b(textView, "");
        textView.setText(getContext().getString(R.string.f8k, Integer.valueOf(i3)));
        l.b(inflate, "");
        MethodCollector.o(2828);
        return inflate;
    }

    private /* synthetic */ SuggestUserAvatarView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SuggestUserAvatarView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        int i2;
        l.d(context, "");
        MethodCollector.i(3437);
        this.f144558c = (int) n.b(context, 13.0f);
        this.f144559d = (int) n.b(context, 20.0f);
        this.f144560e = (int) n.b(context, 1.0f);
        boolean z = this.f144561f;
        int i3 = R.color.c7;
        if (z) {
            i2 = R.color.c7;
        } else {
            i2 = R.color.f159927k;
        }
        this.f144563h = b.c(context, i2);
        this.f144564i = b.c(context, !this.f144561f ? R.color.bx : i3);
        MethodCollector.o(3437);
    }

    private final View a(MutualUser mutualUser, int i2, boolean z) {
        View inflate;
        Float f2;
        MethodCollector.i(2799);
        UrlModel urlModel = null;
        if (this.f144557a) {
            int i3 = this.f144558c;
            int i4 = i2 * i3;
            if (z) {
                f2 = Float.valueOf((float) i3);
            } else {
                f2 = null;
            }
            Context context = getContext();
            l.b(context, "");
            p pVar = new p(context, f2, (byte) 0);
            int i5 = this.f144559d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
            if (gb.a(pVar.getContext())) {
                layoutParams.setMargins(0, 0, i4, 0);
            } else {
                layoutParams.setMargins(i4, 0, 0, 0);
            }
            pVar.setLayoutParams(layoutParams);
            if (mutualUser != null) {
                urlModel = mutualUser.getAvatarMedium();
            }
            e.a(pVar, urlModel);
            MethodCollector.o(2799);
            return pVar;
        }
        if (this.f144561f) {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.ag6, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.ag5, (ViewGroup) null);
        }
        if (this.f144562g) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(b.c(inflate.getContext(), R.color.f159928l));
            inflate.setBackground(gradientDrawable);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system2.getDisplayMetrics())));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            Integer valueOf3 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system3.getDisplayMetrics())));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            i.a(inflate, valueOf, valueOf2, valueOf3, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system4.getDisplayMetrics()))), false, 16);
        } else if (this.f144561f && i2 == 0) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setStroke(2, b.c(inflate.getContext(), R.color.f159924h));
            inflate.setBackground(gradientDrawable2);
        }
        int i6 = this.f144559d;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i6, i6);
        if (gb.a(inflate.getContext())) {
            layoutParams2.setMargins(0, 0, this.f144558c * i2, 0);
        } else {
            layoutParams2.setMargins(this.f144558c * i2, 0, 0, 0);
        }
        inflate.setLayoutParams(layoutParams2);
        RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.or);
        if (mutualUser != null) {
            urlModel = mutualUser.getAvatarMedium();
        }
        e.a(remoteImageView, urlModel);
        l.b(inflate, "");
        MethodCollector.o(2799);
        return inflate;
    }
}

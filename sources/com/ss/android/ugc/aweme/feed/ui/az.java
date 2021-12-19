package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.e;
import java.util.ArrayList;
import java.util.List;

public final class az extends DmtStatusView {

    /* renamed from: b  reason: collision with root package name */
    private List<View> f94295b = new ArrayList(3);

    /* renamed from: c  reason: collision with root package name */
    private List<a> f94296c = new ArrayList(3);

    /* renamed from: d  reason: collision with root package name */
    private int f94297d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f94298e = -1;

    /* renamed from: f  reason: collision with root package name */
    private Integer f94299f = null;

    public interface a {
        static {
            Covode.recordClassIndex(59913);
        }

        View a(View view);
    }

    static {
        Covode.recordClassIndex(59912);
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtStatusView
    public final DmtStatusView.a c() {
        return null;
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtStatusView
    public final void setBuilder(DmtStatusView.a aVar) {
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtStatusView
    public final boolean j() {
        if (this.f94297d == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtStatusView
    public final boolean k() {
        if (this.f94297d == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtStatusView
    public final boolean e() {
        if (this.f94297d == -1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtStatusView
    public final boolean l() {
        if (this.f94297d == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtStatusView
    public final void d() {
        int i2 = this.f94297d;
        if (i2 != -1) {
            View view = this.f94295b.get(i2);
            if (view != null) {
                view.setVisibility(8);
            }
            setVisibility(8);
            this.f94297d = -1;
        }
    }

    @Override // com.bytedance.ies.dmt.ui.common.d, com.bytedance.ies.dmt.ui.widget.DmtStatusView
    public final void a(int i2) {
        d(i2);
    }

    public az(Context context) {
        super(context);
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtStatusView
    public final void setStatus(int i2) {
        View view;
        int i3 = this.f94297d;
        if (i3 != i2) {
            if (i3 >= 0 && (view = this.f94295b.get(i3)) != null) {
                view.setVisibility(8);
            }
            if (i2 >= 0) {
                setVisibility(0);
                View c2 = c(i2);
                if (c2 != null) {
                    c2.setVisibility(0);
                }
            } else {
                setVisibility(8);
            }
            this.f94297d = i2;
        }
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtStatusView, com.bytedance.ies.dmt.ui.widget.h
    public final void setUseScreenHeight(int i2) {
        View view = this.f94295b.get(0);
        if (view instanceof DmtLoadingLayout) {
            ((DmtLoadingLayout) view).setUseScreenHeight(i2);
        }
        View view2 = this.f94295b.get(1);
        if (view2 instanceof e) {
            ((e) view2).setUseScreenHeight(i2);
        }
        View view3 = this.f94295b.get(2);
        if (view3 instanceof e) {
            ((e) view3).setUseScreenHeight(i2);
        }
        this.f94299f = Integer.valueOf(i2);
    }

    public final void d(int i2) {
        if (i2 >= 0 && this.f94298e != i2) {
            this.f94298e = i2;
            View view = this.f94295b.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).a(this.f94298e);
            }
            View view2 = this.f94295b.get(1);
            if (view2 instanceof e) {
                ((e) view2).a(this.f94298e);
            }
            View view3 = this.f94295b.get(2);
            if (view3 instanceof e) {
                ((e) view3).a(this.f94298e);
            }
        }
    }

    public final View c(int i2) {
        View view = this.f94295b.get(i2);
        if (view == null && this.f94296c.get(i2) != null) {
            this.f94296c.set(i2, null);
            view = this.f94296c.get(i2).a(this);
            boolean z = view instanceof e;
            if (z && getForceDarkTheme().booleanValue()) {
                ((e) view).a((Boolean) true);
            }
            if (view != null) {
                this.f94295b.set(i2, view);
                Integer num = this.f94299f;
                if (num != null) {
                    if (i2 == 0) {
                        if (view instanceof DmtLoadingLayout) {
                            ((DmtLoadingLayout) view).setUseScreenHeight(num.intValue());
                        }
                    } else if (i2 == 1) {
                        if (z) {
                            ((e) view).setUseScreenHeight(num.intValue());
                        }
                    } else if (i2 == 2 && z) {
                        ((e) view).setUseScreenHeight(num.intValue());
                    }
                }
                int i3 = this.f94298e;
                if (i3 > 0) {
                    if (i2 == 0) {
                        if (view instanceof DmtLoadingLayout) {
                            ((DmtLoadingLayout) view).a(i3);
                        }
                    } else if (i2 == 1) {
                        if (z) {
                            ((e) view).a(i3);
                        }
                    } else if (i2 == 2 && z) {
                        ((e) view).a(i3);
                    }
                }
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                view.setVisibility(8);
                addView(view);
            }
        }
        return view;
    }

    public final void a(a aVar, a aVar2, a aVar3) {
        this.f94295b.add(0, null);
        this.f94295b.add(1, null);
        this.f94295b.add(2, null);
        this.f94296c.add(0, aVar);
        this.f94296c.add(1, aVar2);
        this.f94296c.add(2, aVar3);
        if (this.f94298e < 0) {
            this.f94298e = b.a.f33348a.f33347a;
        }
    }
}

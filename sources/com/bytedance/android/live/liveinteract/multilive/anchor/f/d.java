package com.bytedance.android.live.liveinteract.multilive.anchor.f;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.at;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.live.liveinteract.multiguest.opt.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;

public final class d extends g {
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a  reason: collision with root package name */
    public a f11646a;

    static {
        Covode.recordClassIndex(6334);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a() {
        return R.layout.bd4;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final n c() {
        return n.GRID;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a
    public final FrameLayout e() {
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null || c(viewGroup).size() != 0) {
            return super.e();
        }
        ViewGroup viewGroup2 = this.f11783d;
        if (viewGroup2 != null) {
            return (FrameLayout) viewGroup2.findViewById(R.id.d67);
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
        e.f10014a.a(this);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.f.g, com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final void a(ViewGroup viewGroup) {
        View findViewById;
        View findViewById2;
        l.d(viewGroup, "");
        super.a(viewGroup);
        ViewGroup viewGroup2 = this.f11783d;
        if (!(viewGroup2 == null || (findViewById2 = viewGroup2.findViewById(R.id.eoa)) == null)) {
            findViewById2.setVisibility(8);
        }
        ViewGroup viewGroup3 = this.f11783d;
        if (viewGroup3 != null && (findViewById = viewGroup3.findViewById(R.id.xh)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final void a(View view) {
        MethodCollector.i(7970);
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            MethodCollector.o(7970);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (l.a(parent, viewGroup.findViewById(R.id.d63))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d63)).removeView(view);
            } else if (l.a(parent, viewGroup.findViewById(R.id.d64))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d64)).removeView(view);
            } else if (l.a(parent, viewGroup.findViewById(R.id.d65))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d65)).removeView(view);
            }
        }
        ViewGroup viewGroup2 = this.f11783d;
        if (viewGroup2 != null) {
            ArrayList<View> c2 = c(viewGroup2);
            int size = c2.size();
            if (size == 0) {
                FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.d63);
                l.b(frameLayout, "");
                frameLayout.setVisibility(8);
                FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.d64);
                l.b(frameLayout2, "");
                frameLayout2.setVisibility(8);
                FrameLayout frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.d65);
                l.b(frameLayout3, "");
                frameLayout3.setVisibility(8);
                View findViewById = viewGroup2.findViewById(R.id.eoa);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = viewGroup2.findViewById(R.id.xh);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                View findViewById3 = viewGroup2.findViewById(R.id.d1a);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
                View findViewById4 = viewGroup2.findViewById(R.id.d1b);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(8);
                }
                View findViewById5 = viewGroup2.findViewById(R.id.d18);
                if (findViewById5 != null) {
                    findViewById5.setVisibility(8);
                }
            } else if (size == 1) {
                FrameLayout frameLayout4 = (FrameLayout) viewGroup2.findViewById(R.id.d63);
                l.b(frameLayout4, "");
                frameLayout4.setVisibility(8);
                FrameLayout frameLayout5 = (FrameLayout) viewGroup2.findViewById(R.id.d65);
                l.b(frameLayout5, "");
                frameLayout5.setVisibility(8);
                FrameLayout frameLayout6 = (FrameLayout) viewGroup2.findViewById(R.id.d64);
                l.b(frameLayout6, "");
                frameLayout6.setVisibility(0);
                View view2 = c2.get(0);
                l.b(view2, "");
                a(view2, (FrameLayout) viewGroup2.findViewById(R.id.d64));
                View findViewById6 = viewGroup2.findViewById(R.id.d1a);
                if (findViewById6 != null) {
                    findViewById6.setVisibility(8);
                }
                View findViewById7 = viewGroup2.findViewById(R.id.d1b);
                if (findViewById7 != null) {
                    findViewById7.setVisibility(8);
                }
                View findViewById8 = viewGroup2.findViewById(R.id.d18);
                if (findViewById8 != null) {
                    findViewById8.setVisibility(0);
                }
            } else if (size == 2) {
                FrameLayout frameLayout7 = (FrameLayout) viewGroup2.findViewById(R.id.d63);
                l.b(frameLayout7, "");
                frameLayout7.setVisibility(8);
                FrameLayout frameLayout8 = (FrameLayout) viewGroup2.findViewById(R.id.d64);
                l.b(frameLayout8, "");
                frameLayout8.setVisibility(0);
                FrameLayout frameLayout9 = (FrameLayout) viewGroup2.findViewById(R.id.d65);
                if (frameLayout9 != null) {
                    frameLayout9.setVisibility(0);
                }
                View view3 = c2.get(0);
                l.b(view3, "");
                a(view3, (FrameLayout) viewGroup2.findViewById(R.id.d64));
                View view4 = c2.get(1);
                l.b(view4, "");
                a(view4, (FrameLayout) viewGroup2.findViewById(R.id.d65));
                View findViewById9 = viewGroup2.findViewById(R.id.d1a);
                if (findViewById9 != null) {
                    findViewById9.setVisibility(8);
                }
                View findViewById10 = viewGroup2.findViewById(R.id.d1b);
                if (findViewById10 != null) {
                    findViewById10.setVisibility(0);
                }
                View findViewById11 = viewGroup2.findViewById(R.id.d18);
                if (findViewById11 != null) {
                    findViewById11.setVisibility(0);
                }
            }
            n();
        }
        a aVar = this.f11646a;
        if (aVar == null) {
            l.a("mMultiGuestDataHolder");
        }
        if (aVar.f11302l == 0) {
            a aVar2 = this.f11646a;
            if (aVar2 == null) {
                l.a("mMultiGuestDataHolder");
            }
            aVar2.a(n.NORMAL);
        }
        this.f11788i.c(at.class, Integer.valueOf(c(viewGroup).size() + 1));
        MethodCollector.o(7970);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a(View view, int i2) {
        int a2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View childAt;
        View childAt2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        FrameLayout frameLayout5;
        MethodCollector.i(7902);
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            MethodCollector.o(7902);
            return -1;
        }
        View findViewById = viewGroup.findViewById(R.id.eoa);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = viewGroup.findViewById(R.id.xh);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.d63);
        if (frameLayout6 == null || frameLayout6.getChildCount() != 0 || (frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d64)) == null || frameLayout5.getChildCount() != 0) {
            FrameLayout frameLayout7 = (FrameLayout) viewGroup.findViewById(R.id.d63);
            if (frameLayout7 == null || frameLayout7.getChildCount() != 0 || (frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d64)) == null || frameLayout3.getChildCount() <= 0 || !((frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.d65)) == null || frameLayout4.getChildCount() == 0)) {
                FrameLayout frameLayout8 = (FrameLayout) viewGroup.findViewById(R.id.d63);
                if (frameLayout8 == null || frameLayout8.getChildCount() != 0 || (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d64)) == null || frameLayout.getChildCount() <= 0 || (frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.d65)) == null || frameLayout2.getChildCount() <= 0) {
                    a2 = super.a(view, i2);
                } else {
                    FrameLayout frameLayout9 = (FrameLayout) viewGroup.findViewById(R.id.d64);
                    if (!(frameLayout9 == null || (childAt2 = frameLayout9.getChildAt(0)) == null)) {
                        a(childAt2, (FrameLayout) viewGroup.findViewById(R.id.d63));
                    }
                    FrameLayout frameLayout10 = (FrameLayout) viewGroup.findViewById(R.id.d65);
                    if (!(frameLayout10 == null || (childAt = frameLayout10.getChildAt(0)) == null)) {
                        a(childAt, (FrameLayout) viewGroup.findViewById(R.id.d64));
                    }
                    FrameLayout frameLayout11 = (FrameLayout) viewGroup.findViewById(R.id.d65);
                    if (frameLayout11 != null) {
                        frameLayout11.setVisibility(0);
                    }
                    FrameLayout frameLayout12 = (FrameLayout) viewGroup.findViewById(R.id.d65);
                    if (frameLayout12 != null) {
                        frameLayout12.addView(view, o());
                    }
                    View findViewById3 = viewGroup.findViewById(R.id.d1a);
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(0);
                    }
                    a2 = 3;
                }
            } else {
                FrameLayout frameLayout13 = (FrameLayout) viewGroup.findViewById(R.id.d63);
                l.b(frameLayout13, "");
                frameLayout13.setVisibility(8);
                FrameLayout frameLayout14 = (FrameLayout) viewGroup.findViewById(R.id.d64);
                l.b(frameLayout14, "");
                frameLayout14.setVisibility(0);
                FrameLayout frameLayout15 = (FrameLayout) viewGroup.findViewById(R.id.d65);
                if (frameLayout15 != null) {
                    frameLayout15.setVisibility(0);
                }
                FrameLayout frameLayout16 = (FrameLayout) viewGroup.findViewById(R.id.d65);
                if (frameLayout16 != null) {
                    frameLayout16.addView(view, o());
                }
                View findViewById4 = viewGroup.findViewById(R.id.d1b);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(0);
                }
                a2 = 2;
            }
        } else {
            FrameLayout frameLayout17 = (FrameLayout) viewGroup.findViewById(R.id.d63);
            l.b(frameLayout17, "");
            frameLayout17.setVisibility(8);
            FrameLayout frameLayout18 = (FrameLayout) viewGroup.findViewById(R.id.d65);
            l.b(frameLayout18, "");
            frameLayout18.setVisibility(8);
            FrameLayout frameLayout19 = (FrameLayout) viewGroup.findViewById(R.id.d64);
            l.b(frameLayout19, "");
            frameLayout19.setVisibility(0);
            ((FrameLayout) viewGroup.findViewById(R.id.d64)).addView(view, o());
            View findViewById5 = viewGroup.findViewById(R.id.d18);
            if (findViewById5 != null) {
                findViewById5.setVisibility(0);
            }
            a2 = 1;
        }
        this.f11788i.c(at.class, Integer.valueOf(c(viewGroup).size() + 1));
        MethodCollector.o(7902);
        return a2;
    }
}

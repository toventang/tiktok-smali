package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.chatroom.c.f;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a extends ConstraintLayout {
    private float A;
    private float B;
    private float C;
    private float D;
    private final int E;
    private boolean F;
    private boolean G;
    private final b H;

    /* renamed from: g  reason: collision with root package name */
    protected final av f16640g;

    /* renamed from: h  reason: collision with root package name */
    protected final boolean f16641h;

    /* renamed from: i  reason: collision with root package name */
    protected final AbstractC0333a f16642i;

    /* renamed from: j  reason: collision with root package name */
    public View f16643j;

    /* renamed from: k  reason: collision with root package name */
    protected final int[] f16644k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    protected final int f16645l;

    /* renamed from: m  reason: collision with root package name */
    protected final int f16646m;
    protected String n;
    public View o;
    private boolean p;
    private TextView q;
    private View r;
    private View s;
    private View t;
    private int[] u;
    private final int[] v = new int[2];
    private final int[] w = new int[2];
    private final Rect x = new Rect();
    private final Rect y = new Rect();
    private boolean z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.a$a  reason: collision with other inner class name */
    public interface AbstractC0333a {
        static {
            Covode.recordClassIndex(9228);
        }

        void a(boolean z);

        void d();

        void d(av avVar);
    }

    static {
        Covode.recordClassIndex(9226);
    }

    /* access modifiers changed from: protected */
    public abstract void b(View view);

    /* access modifiers changed from: protected */
    public abstract View c();

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        a(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        a(true);
    }

    public void e() {
        String str;
        av avVar = this.f16640g;
        if (avVar != null) {
            str = avVar.f19002d;
        } else {
            str = "";
        }
        this.n = str;
    }

    public int getType() {
        av avVar = this.f16640g;
        if (avVar != null) {
            return avVar.f19005g;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.H;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    private void h() {
        this.D = -1.0f;
        this.C = -1.0f;
        this.B = -1.0f;
        this.A = -1.0f;
        this.p = false;
        this.F = false;
        this.G = false;
    }

    public av getRoomDecoration() {
        av avVar = this.f16640g;
        if (avVar == null) {
            return null;
        }
        if (this.f16641h) {
            avVar.f19009k = this.f16645l;
            this.f16640g.f19010l = this.f16646m;
        }
        return this.f16640g;
    }

    private boolean i() {
        View view;
        if (this.s == null || (view = this.o) == null) {
            return false;
        }
        view.getLocationOnScreen(this.w);
        a(this.o, this.x, this.w);
        this.x.offset(0, this.o.getMeasuredHeight() / 3);
        this.s.getLocationOnScreen(this.v);
        a(this.s, this.y, this.v);
        return this.x.intersect(this.y);
    }

    public final void b() {
        View view = this.o;
        if (view != null) {
            float x2 = view.getX();
            int[] iArr = this.f16644k;
            if (x2 < ((float) iArr[2])) {
                this.o.setX((float) iArr[2]);
            } else {
                int[] iArr2 = this.f16644k;
                if (this.o.getX() + ((float) this.o.getMeasuredWidth()) > ((float) iArr2[3])) {
                    View view2 = this.o;
                    view2.setX((float) (iArr2[3] - view2.getMeasuredWidth()));
                }
            }
            float y2 = this.o.getY();
            int[] iArr3 = this.f16644k;
            if (y2 < ((float) iArr3[0])) {
                this.o.setY((float) iArr3[0]);
                return;
            }
            int[] iArr4 = this.f16644k;
            if (this.o.getY() + ((float) this.o.getMeasuredHeight()) > ((float) iArr4[1])) {
                View view3 = this.o;
                view3.setY((float) (iArr4[1] - view3.getMeasuredHeight()));
            }
        }
    }

    public JSONObject getDecorationInfo() {
        if (this.f16640g == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", String.valueOf(this.f16640g.f19006h));
            jSONObject.put(StringSet.type, this.f16640g.f19005g);
            jSONObject.put("content", this.f16640g.f19002d);
            jSONObject.put("x", this.f16640g.f19007i);
            jSONObject.put("y", this.f16640g.f19008j);
            jSONObject.put("w", this.f16645l);
            jSONObject.put("h", this.f16646m);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void setText(String str) {
        this.n = str;
    }

    private void d(boolean z2) {
        if (this.f16642i != null && y.f()) {
            this.f16642i.a(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2) {
        AbstractC0333a aVar = this.f16642i;
        if (aVar != null) {
            aVar.d(this.f16640g);
        }
    }

    private void b(final boolean z2) {
        View view;
        int[] iArr = this.u;
        if (iArr != null && (view = this.f16643j) != null) {
            int[] iArr2 = this.f16644k;
            iArr2[0] = iArr[0];
            iArr2[2] = iArr[2];
            iArr2[3] = iArr[3];
            int i2 = this.f16646m - iArr[1];
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i2;
                this.f16643j.setLayoutParams(layoutParams);
                this.f16643j.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                    /* class com.bytedance.android.livesdk.chatroom.widget.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(9227);
                    }

                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        if (a.this.f16643j != null) {
                            a.this.f16643j.removeOnLayoutChangeListener(this);
                            a.this.f16644k[1] = a.this.f16643j.getTop();
                            if (z2) {
                                a aVar = a.this;
                                aVar.o = aVar.c();
                                if (a.this.o != null) {
                                    a aVar2 = a.this;
                                    aVar2.addView(aVar2.o);
                                    a aVar3 = a.this;
                                    aVar3.b(aVar3.o);
                                    return;
                                }
                                return;
                            }
                            a.this.b();
                        }
                    }
                });
            }
        }
    }

    private void c(boolean z2) {
        View view = this.r;
        if (view != null) {
            if (z2) {
                if (view.getVisibility() != 0) {
                    this.r.setVisibility(0);
                }
            } else if (this.r.getVisibility() != 4) {
                this.r.setVisibility(4);
            }
        }
    }

    public final void a(int[] iArr) {
        if (iArr != null) {
            this.u = iArr;
            b(false);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f16641h || this.o == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (this.F || super.onInterceptTouchEvent(motionEvent)) {
                            return true;
                        }
                        return false;
                    }
                } else if (this.F) {
                    return true;
                } else {
                    if (!this.G) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    float abs = Math.abs(motionEvent.getX() - this.A);
                    float abs2 = Math.abs(motionEvent.getY() - this.B);
                    int i2 = this.E;
                    if (abs >= ((float) i2) || abs2 >= ((float) i2)) {
                        this.C = motionEvent.getX();
                        this.D = motionEvent.getY();
                        this.F = true;
                    }
                    if (this.F || super.onInterceptTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
            }
            if (!this.F) {
                h();
            }
            if (this.F || super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        h();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (x2 >= this.o.getX() && x2 <= this.o.getX() + ((float) this.o.getMeasuredWidth()) && y2 >= this.o.getY() && y2 <= this.o.getY() + ((float) this.o.getMeasuredHeight())) {
            this.A = motionEvent.getX();
            this.B = motionEvent.getY();
            this.G = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        String str;
        int i2;
        if (!this.f16641h || this.o == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.F) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            if (i()) {
                a(false);
            } else if (this.p) {
                this.f16640g.f19007i = (int) (this.o.getX() + ((float) (this.o.getMeasuredWidth() / 2)));
                this.f16640g.f19008j = (int) (this.o.getY() + ((float) (this.o.getMeasuredHeight() / 2)));
                AbstractC0333a aVar = this.f16642i;
                if (aVar != null) {
                    aVar.d();
                }
            } else {
                d();
            }
            h();
            c(false);
            d(false);
            return true;
        } else if (action == 2) {
            float x2 = motionEvent.getX() - this.C;
            float y2 = motionEvent.getY() - this.D;
            float x3 = this.o.getX() + x2;
            int[] iArr = this.f16644k;
            if (x3 < ((float) iArr[2])) {
                x3 = (float) iArr[2];
            }
            int[] iArr2 = this.f16644k;
            if (((float) this.o.getMeasuredWidth()) + x3 > ((float) iArr2[3])) {
                x3 = (float) (iArr2[3] - this.o.getMeasuredWidth());
            }
            if (x3 != this.o.getX()) {
                this.o.setX(x3);
                this.C = motionEvent.getX();
                this.p = true;
            }
            float y3 = this.o.getY() + y2;
            int[] iArr3 = this.f16644k;
            if (y3 < ((float) iArr3[0])) {
                y3 = (float) iArr3[0];
            }
            int[] iArr4 = this.f16644k;
            if (((float) this.o.getMeasuredHeight()) + y3 > ((float) iArr4[1])) {
                y3 = (float) (iArr4[1] - this.o.getMeasuredHeight());
            }
            if (y3 != this.o.getY()) {
                this.o.setY(y3);
                this.D = motionEvent.getY();
                this.p = true;
            }
            boolean i3 = i();
            if (i3 != this.z) {
                this.z = i3;
                TextView textView = this.q;
                if (textView != null) {
                    if (i3) {
                        i2 = 2131234863;
                    } else {
                        i2 = 2131234862;
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, 0);
                }
                View view2 = this.s;
                if (view2 != null) {
                    if (i3) {
                        str = "#57FF3B5C";
                    } else {
                        str = "#57000000";
                    }
                    view2.setBackgroundColor(Color.parseColor(str));
                }
            }
            if (!(this.t == null || (view = this.o) == null)) {
                if (view.getY() + ((float) this.o.getMeasuredHeight()) >= ((float) this.f16644k[1])) {
                    if (this.t.getVisibility() != 0) {
                        this.t.setVisibility(0);
                    }
                } else if (this.t.getVisibility() != 4) {
                    this.t.setVisibility(4);
                }
            }
            d(true);
            c(true);
            return true;
        } else if (action != 3) {
            return true;
        } else {
            h();
            c(false);
            d(false);
            return true;
        }
    }

    private static void a(View view, Rect rect, int[] iArr) {
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
    }

    public a(Context context, av avVar, boolean z2, int[] iArr, AbstractC0333a aVar, boolean z3) {
        super(context);
        this.f16640g = avVar;
        this.f16641h = z2;
        this.u = iArr;
        this.f16642i = aVar;
        this.f16645l = n.a(getContext());
        this.f16646m = n.b(getContext());
        this.E = ViewConfiguration.get(context).getScaledTouchSlop();
        inflate(context, R.layout.b5y, this);
        this.r = findViewById(R.id.c7e);
        this.s = findViewById(R.id.ajx);
        this.f16643j = findViewById(R.id.vy);
        this.q = (TextView) findViewById(R.id.ajy);
        this.t = findViewById(R.id.vx);
        b(true);
        if (z3) {
            post(new b(this));
        }
        this.H = com.bytedance.android.livesdk.an.a.a().a(f.class).d(new c(this));
    }
}

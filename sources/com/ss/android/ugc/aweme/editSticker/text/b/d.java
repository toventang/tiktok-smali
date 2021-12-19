package com.ss.android.ugc.aweme.editSticker.text.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.view.q;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public float f88384a;

    /* renamed from: b  reason: collision with root package name */
    public float f88385b;

    /* renamed from: c  reason: collision with root package name */
    public float f88386c;

    /* renamed from: d  reason: collision with root package name */
    public float f88387d;

    /* renamed from: e  reason: collision with root package name */
    public float f88388e;

    /* renamed from: f  reason: collision with root package name */
    public float f88389f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f88390g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f88391h;

    /* renamed from: i  reason: collision with root package name */
    public float f88392i;

    /* renamed from: j  reason: collision with root package name */
    public float f88393j;

    /* renamed from: k  reason: collision with root package name */
    public float f88394k;

    /* renamed from: l  reason: collision with root package name */
    public float f88395l;

    /* renamed from: m  reason: collision with root package name */
    public int f88396m = 15;
    public q n;

    static {
        Covode.recordClassIndex(55587);
    }

    private boolean c(float f2, float f3, float f4, float f5) {
        boolean z;
        boolean z2;
        float f6 = this.f88394k;
        if (f6 < 0.0f ? f3 > f6 : f3 < f6) {
            z = false;
        } else {
            z = true;
        }
        float f7 = this.f88395l;
        if (f7 < 1.0f ? f2 > f7 : f2 < f7) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2 || f4 != this.f88392i || f5 != this.f88393j) {
            return false;
        }
        return true;
    }

    private boolean d(float f2, float f3, float f4, float f5) {
        if (this.f88394k >= 0.0f) {
            if (f2 > 1.0f || f3 > 0.0f || f4 != this.f88388e || f5 != this.f88389f) {
                return false;
            }
            return true;
        } else if (f2 > 1.0f || f3 < 0.0f || f4 != this.f88388e || f5 != this.f88389f) {
            return false;
        } else {
            return true;
        }
    }

    public final void a(float f2, float f3, float f4, float f5) {
        if (this.f88391h) {
            if (c(f2, f3, f4, f5)) {
                this.f88391h = false;
                this.f88390g = false;
                this.n.b(this.f88395l);
                this.n.c(this.f88394k);
                this.n.setCenterX(this.f88392i);
                this.n.setCenterY(this.f88393j);
                this.n.invalidate();
                return;
            }
            float f6 = this.f88395l;
            if (f2 <= f6) {
                float f7 = f2 - this.f88384a;
                if (f7 <= f6) {
                    f6 = f7;
                }
                this.n.b(f6);
            } else {
                float f8 = f2 + this.f88384a;
                if (f8 >= f6) {
                    f6 = f8;
                }
                this.n.b(f6);
            }
            float f9 = this.f88394k;
            if (f9 > 0.0f) {
                if (f3 <= f9) {
                    float f10 = f3 - this.f88385b;
                    if (f10 <= f9) {
                        f9 = f10;
                    }
                    this.n.c(f9);
                }
            } else if (f3 >= f9) {
                float f11 = f3 - this.f88385b;
                if (f11 >= f9) {
                    f9 = f11;
                }
                this.n.c(f9);
            }
            float f12 = this.f88392i;
            if (f12 > this.f88388e) {
                if (f4 < f12) {
                    float f13 = f4 - this.f88386c;
                    if (f13 <= f12) {
                        f12 = f13;
                    }
                    this.n.setCenterX(f12);
                }
            } else if (f4 > f12) {
                float f14 = f4 - this.f88386c;
                if (f14 >= f12) {
                    f12 = f14;
                }
                this.n.setCenterX(f12);
            }
            float f15 = this.f88393j;
            if (f15 > this.f88389f) {
                if (f5 < f15) {
                    float f16 = f5 - this.f88387d;
                    if (f16 <= f15) {
                        f15 = f16;
                    }
                    this.n.setCenterY(f15);
                }
            } else if (f5 > f15) {
                float f17 = f5 - this.f88387d;
                if (f17 >= f15) {
                    f15 = f17;
                }
                this.n.setCenterY(f15);
            }
            this.n.invalidate();
        }
    }

    public final void b(float f2, float f3, float f4, float f5) {
        if (this.f88390g) {
            float f6 = 1.0f;
            float f7 = 0.0f;
            if (d(f2, f3, f4, f5)) {
                this.f88390g = false;
                this.f88391h = false;
                this.n.b(1.0f);
                this.n.c(0.0f);
                this.n.setCenterX(this.f88388e);
                this.n.setCenterY(this.f88389f);
                this.n.invalidate();
                return;
            }
            if (f2 > 1.0f) {
                float f8 = f2 - this.f88384a;
                if (f8 >= 1.0f) {
                    f6 = f8;
                }
                this.n.b(f6);
            } else {
                float f9 = f2 + this.f88384a;
                if (f9 <= 1.0f) {
                    f6 = f9;
                }
                this.n.b(f6);
            }
            if (this.f88394k > 0.0f) {
                if (f3 >= 0.0f) {
                    float f10 = f3 - this.f88385b;
                    if (f10 >= 0.0f) {
                        f7 = f10;
                    }
                    this.n.c(f7);
                }
            } else if (f3 <= 0.0f) {
                float f11 = f3 - this.f88385b;
                if (f11 <= 0.0f) {
                    f7 = f11;
                }
                this.n.c(f7);
            }
            float f12 = this.f88392i;
            float f13 = this.f88388e;
            if (f12 > f13) {
                if (f4 > f13) {
                    float f14 = f4 - this.f88386c;
                    if (f14 >= f13) {
                        f13 = f14;
                    }
                    this.n.setCenterX(f13);
                }
            } else if (f4 < f13) {
                float f15 = f4 - this.f88386c;
                if (f15 <= f13) {
                    f13 = f15;
                }
                this.n.setCenterX(f13);
            }
            float f16 = this.f88393j;
            float f17 = this.f88389f;
            if (f16 > f17) {
                if (f5 > f17) {
                    float f18 = f5 - this.f88387d;
                    if (f18 >= f17) {
                        f17 = f18;
                    }
                    this.n.setCenterY(f17);
                }
            } else if (f5 < f17) {
                float f19 = f5 - this.f88387d;
                if (f19 <= f17) {
                    f17 = f19;
                }
                this.n.setCenterY(f17);
            }
            this.n.invalidate();
        }
    }
}

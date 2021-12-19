package com.bytedance.android.live.broadcast.c;

import com.bytedance.android.live.broadcast.stream.capture.a;
import com.bytedance.android.live.broadcast.stream.capture.a.b;
import com.bytedance.android.livesdk.chatroom.c.v;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private b f7831a;

    static {
        Covode.recordClassIndex(3874);
    }

    public d(a aVar) {
        b bVar = new b();
        this.f7831a = bVar;
        aVar.a(bVar);
    }

    public final void onEvent(v vVar) {
        if (vVar != null) {
            int i2 = vVar.f15153a;
            v.a aVar = vVar.f15154b;
            switch (i2) {
                case 201:
                    float f2 = aVar.f15156b;
                    float f3 = aVar.f15157c;
                    int i3 = aVar.f15155a;
                    b bVar = this.f7831a;
                    if (bVar != null && bVar.f9874a != null) {
                        bVar.f9874a.a(f2, f3, i3);
                        return;
                    }
                    return;
                case 202:
                    float f4 = aVar.f15156b;
                    float f5 = aVar.f15157c;
                    int i4 = aVar.f15155a;
                    b bVar2 = this.f7831a;
                    if (bVar2 != null && bVar2.f9874a != null) {
                        bVar2.f9874a.b(f4, f5, i4);
                        return;
                    }
                    return;
                case 203:
                    float f6 = aVar.f15156b;
                    float f7 = aVar.f15157c;
                    float f8 = aVar.f15158d;
                    float f9 = aVar.f15159e;
                    float f10 = aVar.f15160f;
                    b bVar3 = this.f7831a;
                    if (bVar3 != null && bVar3.f9874a != null) {
                        bVar3.f9874a.a(f6, f7, f8, f9, f10);
                        return;
                    }
                    return;
                case 204:
                    float f11 = aVar.f15156b;
                    float f12 = aVar.f15157c;
                    b bVar4 = this.f7831a;
                    if (bVar4 != null && bVar4.f9874a != null) {
                        bVar4.f9874a.b(f11, f12);
                        return;
                    }
                    return;
                case 205:
                    float f13 = aVar.f15161g;
                    float f14 = aVar.f15160f;
                    b bVar5 = this.f7831a;
                    if (bVar5 != null && bVar5.f9874a != null) {
                        bVar5.f9874a.c(f13, f14);
                        return;
                    }
                    return;
                case 206:
                    float f15 = aVar.f15156b;
                    float f16 = aVar.f15157c;
                    b bVar6 = this.f7831a;
                    if (bVar6 != null && bVar6.f9874a != null) {
                        bVar6.f9874a.a(f15, f16);
                        return;
                    }
                    return;
                case 207:
                    long j2 = aVar.f15162h;
                    float f17 = aVar.f15156b;
                    float f18 = aVar.f15157c;
                    float f19 = aVar.f15163i;
                    float f20 = aVar.f15164j;
                    int i5 = aVar.f15165k;
                    int i6 = aVar.f15166l;
                    b bVar7 = this.f7831a;
                    if (bVar7 != null && bVar7.f9874a != null) {
                        bVar7.f9874a.a(j2, f17, f18, f19, f20, i5, i6);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}

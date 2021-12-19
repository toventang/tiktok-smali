package com.bytedance.android.livesdk.gift.b;

import com.bytedance.android.livesdk.livesetting.gift.HideGiftIconForUserSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(9906);
    }

    public enum b {
        YES,
        NO,
        WHATEVER;

        static {
            Covode.recordClassIndex(9908);
        }
    }

    /* JADX WARN: Init of enum SHOW can be incorrect */
    /* JADX WARN: Init of enum HIDE can be incorrect */
    /* renamed from: com.bytedance.android.livesdk.gift.b.a$a  reason: collision with other inner class name */
    public enum EnumC0371a {
        SHOW("Show the gift icon", r3),
        HIDE("Hide the gift icon", r3),
        GREY("Show the grey gift icon", null);
        
        String description;
        List<c> mStatusSets;

        static {
            Covode.recordClassIndex(9907);
            LinkedList linkedList = new LinkedList();
            b bVar = b.YES;
            b bVar2 = b.WHATEVER;
            b bVar3 = b.YES;
            linkedList.add(new c(bVar, bVar2, bVar3, bVar3, b.NO));
            b bVar4 = b.NO;
            b bVar5 = b.WHATEVER;
            b bVar6 = b.YES;
            linkedList.add(new c(bVar4, bVar5, bVar6, bVar6, b.WHATEVER));
            LinkedList linkedList2 = new LinkedList();
            b bVar7 = b.WHATEVER;
            b bVar8 = b.NO;
            b bVar9 = b.WHATEVER;
            linkedList2.add(new c(bVar7, bVar8, bVar8, bVar9, bVar9));
        }

        private EnumC0371a(String str, List list) {
            this.description = str;
            this.mStatusSets = list;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        b f17836a;

        /* renamed from: b  reason: collision with root package name */
        b f17837b;

        /* renamed from: c  reason: collision with root package name */
        b f17838c;

        /* renamed from: d  reason: collision with root package name */
        b f17839d;

        /* renamed from: e  reason: collision with root package name */
        b f17840e;

        static {
            Covode.recordClassIndex(9909);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(c cVar) {
            boolean z = !HideGiftIconForUserSetting.INSTANCE.getValue();
            boolean value = LiveAnchorGiftDisableSetting.INSTANCE.getValue();
            if ((this.f17836a == b.YES && cVar.f17836a == b.NO) || (this.f17836a == b.NO && cVar.f17836a == b.YES)) {
                return false;
            }
            if ((this.f17837b == b.YES && cVar.f17837b == b.NO) || (this.f17837b == b.NO && cVar.f17837b == b.YES)) {
                return false;
            }
            if (!z ? this.f17838c == b.YES : this.f17838c == b.NO) {
                return false;
            }
            if ((this.f17839d == b.YES && cVar.f17839d == b.NO) || (this.f17839d == b.NO && cVar.f17839d == b.YES)) {
                return false;
            }
            if (!value ? this.f17840e == b.YES : this.f17840e == b.NO) {
                return false;
            }
            return true;
        }

        c(b bVar, b bVar2, b bVar3, b bVar4, b bVar5) {
            this.f17836a = bVar;
            this.f17837b = bVar2;
            this.f17838c = bVar3;
            this.f17839d = bVar4;
            this.f17840e = bVar5;
        }
    }

    public static c b(boolean z, boolean z2, boolean z3) {
        b bVar;
        b bVar2;
        b bVar3;
        if (z) {
            bVar = b.YES;
        } else {
            bVar = b.NO;
        }
        if (z2) {
            bVar2 = b.YES;
        } else {
            bVar2 = b.NO;
        }
        if (z3) {
            bVar3 = b.YES;
        } else {
            bVar3 = b.NO;
        }
        return new c(bVar, bVar2, b.WHATEVER, bVar3, b.WHATEVER);
    }

    public static EnumC0371a a(boolean z, boolean z2, boolean z3) {
        c b2 = b(z, z2, z3);
        EnumC0371a[] values = EnumC0371a.values();
        for (EnumC0371a aVar : values) {
            if (aVar.mStatusSets != null) {
                boolean z4 = false;
                for (c cVar : aVar.mStatusSets) {
                    if (cVar.a(b2)) {
                        z4 = true;
                    }
                }
                if (z4) {
                    return aVar;
                }
            }
        }
        return EnumC0371a.GREY;
    }
}

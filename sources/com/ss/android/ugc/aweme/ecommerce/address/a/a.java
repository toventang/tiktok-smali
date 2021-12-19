package com.ss.android.ugc.aweme.ecommerce.address.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemDTO;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public InputItemDTO f84261a;

    /* renamed from: b  reason: collision with root package name */
    public Object f84262b;

    /* renamed from: c  reason: collision with root package name */
    public String f84263c;

    static {
        Covode.recordClassIndex(52543);
    }

    public /* synthetic */ a(InputItemDTO inputItemDTO) {
        this(inputItemDTO, null, null);
    }

    private a(InputItemDTO inputItemDTO, Object obj, String str) {
        l.d(inputItemDTO, "");
        this.f84261a = inputItemDTO;
        this.f84262b = obj;
        this.f84263c = str;
    }

    private static a a(InputItemDTO inputItemDTO, Object obj, String str) {
        l.d(inputItemDTO, "");
        return new a(inputItemDTO, obj, str);
    }

    public static /* synthetic */ a a(a aVar, InputItemDTO inputItemDTO, Object obj, String str, int i2) {
        if ((i2 & 1) != 0) {
            inputItemDTO = aVar.f84261a;
        }
        if ((i2 & 2) != 0) {
            obj = aVar.f84262b;
        }
        if ((i2 & 4) != 0) {
            str = aVar.f84263c;
        }
        return a(inputItemDTO, obj, str);
    }
}

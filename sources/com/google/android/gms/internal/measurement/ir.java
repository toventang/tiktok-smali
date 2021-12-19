package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ir extends io<FieldDescriptorType, Object> {
    static {
        Covode.recordClassIndex(31884);
    }

    @Override // com.google.android.gms.internal.measurement.io
    public final void a() {
        if (!this.f51027c) {
            for (int i2 = 0; i2 < b(); i2++) {
                Map.Entry b2 = b(i2);
                if (((gd) b2.getKey()).d()) {
                    b2.setValue(Collections.unmodifiableList((List) b2.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((gd) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }

    ir(int i2) {
        super(i2, (byte) 0);
    }
}

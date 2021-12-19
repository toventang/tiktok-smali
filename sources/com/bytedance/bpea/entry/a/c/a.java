package com.bytedance.bpea.entry.a.c;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.bpea.entry.common.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.util.LinkedHashSet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0569a f26664a = new C0569a((byte) 0);

    static {
        Covode.recordClassIndex(15711);
    }

    /* renamed from: com.bytedance.bpea.entry.a.c.a$a  reason: collision with other inner class name */
    public static final class C0569a {
        static {
            Covode.recordClassIndex(15712);
        }

        private C0569a() {
        }

        public /* synthetic */ C0569a(byte b2) {
            this();
        }

        public static com.bytedance.bpea.basics.a a(String[] strArr, PrivacyCert privacyCert) {
            l.c(strArr, "");
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (String str : strArr) {
                    switch (str.hashCode()) {
                        case -1888586689:
                            if (!str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                continue;
                            }
                            break;
                        case -63024214:
                            if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                                break;
                            } else {
                                continue;
                            }
                        case 463403621:
                            if (str.equals("android.permission.CAMERA")) {
                                linkedHashSet.add("video");
                            } else {
                                continue;
                            }
                        case 1831139720:
                            if (str.equals("android.permission.RECORD_AUDIO")) {
                                linkedHashSet.add(DataType.AUDIO);
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                    linkedHashSet.add("latitudeAndLongitude");
                }
                if (!linkedHashSet.isEmpty()) {
                    Object[] array = linkedHashSet.toArray(new String[0]);
                    if (array != null) {
                        a.C0572a.a(privacyCert, (String[]) array, "permission_request");
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                return null;
            } catch (com.bytedance.bpea.basics.a e2) {
                return e2;
            }
        }
    }
}

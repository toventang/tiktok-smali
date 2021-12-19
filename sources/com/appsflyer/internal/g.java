package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g {
    static {
        Covode.recordClassIndex(2732);
    }

    g() {
    }

    /* access modifiers changed from: package-private */
    public enum d {
        NONE,
        FIRST,
        ALL;

        static {
            Covode.recordClassIndex(2735);
        }
    }

    /* access modifiers changed from: package-private */
    public enum b {
        UNKNOWN,
        ACCELEROMETER,
        MAGNETOMETER,
        RESERVED,
        GYROSCOPE;

        static {
            Covode.recordClassIndex(2733);
        }
    }

    /* access modifiers changed from: package-private */
    public enum c {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");
        

        /* renamed from: ı  reason: contains not printable characters */
        String f260;

        static {
            Covode.recordClassIndex(2734);
        }

        private c(String str) {
            this.f260 = str;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static List<BigDecimal> m182(Object obj) {
        AbstractList abstractList = (AbstractList) obj;
        Object obj2 = abstractList.get(0);
        Object obj3 = abstractList.get(1);
        Object obj4 = abstractList.get(2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(BigDecimal.valueOf(Double.parseDouble(obj2.toString())));
        arrayList.add(BigDecimal.valueOf(Double.parseDouble(obj3.toString())));
        arrayList.add(BigDecimal.valueOf(Double.parseDouble(obj4.toString())));
        return arrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Map m183(List<Map<String, Object>> list) {
        boolean z;
        boolean z2;
        d dVar;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (Map<String, Object> map : list) {
            HashMap hashMap2 = new HashMap();
            if (map.get("sVS") != null) {
                z = true;
            } else {
                z = false;
            }
            if (map.get("sVE") != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z) {
                dVar = d.NONE;
            } else if (z2) {
                dVar = d.ALL;
            } else {
                dVar = d.FIRST;
            }
            if (dVar != d.NONE) {
                Number number = (Number) map.get("sT");
                Object obj = map.get("sN");
                if (obj != null) {
                    hashMap2.put("n", obj);
                } else {
                    hashMap2.put("n", "uk");
                }
                b bVar = b.values()[number.intValue()];
                ArrayList arrayList2 = new ArrayList(m182(map.get("sVS")));
                if (dVar == d.ALL) {
                    arrayList2.addAll(m182(map.get("sVE")));
                }
                if (bVar == b.MAGNETOMETER) {
                    ArrayList arrayList3 = new ArrayList();
                    BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((Number) arrayList2.get(1)).doubleValue(), ((Number) arrayList2.get(0)).doubleValue()) * 57.29577951308232d);
                    DecimalFormat decimalFormat = new DecimalFormat("##.#");
                    decimalFormat.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat.format(valueOf))));
                    Object obj2 = arrayList2.get(2);
                    DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                    decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat2.format(obj2))));
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((Number) arrayList2.get(4)).doubleValue(), ((Number) arrayList2.get(3)).doubleValue()) * 57.29577951308232d).subtract(valueOf);
                        DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                        decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat3.format(subtract))));
                        BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                        decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat4.format(subtract2))));
                    }
                    arrayList = new ArrayList();
                    arrayList.add(arrayList3);
                    arrayList.add(arrayList4);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                        DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                        decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat5.format(subtract3))));
                        BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                        DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                        decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat6.format(subtract4))));
                        BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                        decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat7.format(subtract5))));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Object obj3 = arrayList2.get(0);
                    DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                    decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat8.format(obj3))));
                    Object obj4 = arrayList2.get(1);
                    DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                    decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat9.format(obj4))));
                    Object obj5 = arrayList2.get(2);
                    DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                    decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat10.format(obj5))));
                    arrayList = new ArrayList();
                    arrayList.add(arrayList6);
                    arrayList.add(arrayList5);
                }
                hashMap2.put("v", arrayList);
                hashMap.put(c.values()[number.intValue()].f260, hashMap2);
                if (dVar == d.FIRST) {
                    hashMap.put("er", "no_svs");
                }
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("er", "na");
                return hashMap3;
            }
        }
        return hashMap;
    }
}

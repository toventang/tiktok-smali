package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public class c implements Serializable {
    private String extra;
    @com.google.gson.a.c(a = "multi_edit_map")
    private LinkedHashMap<String, List<InteractStickerStruct>> multiEditMap;
    @com.google.gson.a.c(a = "multi_record_map")
    private LinkedHashMap<String, List<InteractStickerStruct>> multiRecordMap;
    private LinkedHashMap<String, InteractStickerStruct> structEditLinkedHashMap;
    private LinkedHashMap<String, InteractStickerStruct> structRecordLinkedHashMap;

    static {
        Covode.recordClassIndex(83435);
    }

    public String getExtra() {
        return this.extra;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f127200a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 83436(0x145ec, float:1.16919E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[] r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.AnonymousClass1.f127200a = r2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_RECORD     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.AnonymousClass1.f127200a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.AnonymousClass1.<clinit>():void");
        }
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public boolean isEmpty(d... dVarArr) {
        for (d dVar : dVarArr) {
            if (!a(dVar).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private LinkedHashMap<String, List<InteractStickerStruct>> a(d dVar) {
        int i2 = AnonymousClass1.f127200a[dVar.ordinal()];
        if (i2 == 1) {
            if (this.multiRecordMap == null) {
                this.multiRecordMap = a.a(this.structRecordLinkedHashMap);
            }
            return this.multiRecordMap;
        } else if (i2 != 2) {
            return new LinkedHashMap<>();
        } else {
            if (this.multiEditMap == null) {
                this.multiEditMap = a.a(this.structEditLinkedHashMap);
            }
            return this.multiEditMap;
        }
    }

    public List<InteractStickerStruct> getStickerStructsByPage(d... dVarArr) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : dVarArr) {
            LinkedHashMap<String, List<InteractStickerStruct>> a2 = a(dVar);
            for (String str : a2.keySet()) {
                List<InteractStickerStruct> list = a2.get(str);
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    public List<InteractStickerStruct> getTrackByType(Integer num, d dVar) {
        LinkedHashMap<String, List<InteractStickerStruct>> a2 = a(dVar);
        if (a2.isEmpty()) {
            return null;
        }
        return a2.get(String.valueOf(num));
    }

    public boolean removeStickerStructByPage(d dVar, int i2) {
        LinkedHashMap<String, List<InteractStickerStruct>> a2 = a(dVar);
        if (a2.get(String.valueOf(i2)) == null) {
            return false;
        }
        a2.remove(String.valueOf(i2));
        return true;
    }

    public void upDateStickerStructs(List<InteractStickerStruct> list, d dVar) {
        LinkedHashMap<String, List<InteractStickerStruct>> a2 = a(dVar);
        a2.clear();
        if (!b.a((Collection) list)) {
            for (InteractStickerStruct interactStickerStruct : list) {
                int i2 = -1;
                int type = interactStickerStruct.getType();
                if (type == 16) {
                    i2 = 16;
                } else if (type != 17) {
                    switch (type) {
                        case 3:
                            i2 = 1;
                            break;
                        case 4:
                            i2 = 2;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            i2 = 3;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            i2 = 4;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            i2 = 5;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            i2 = 8;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            i2 = 9;
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            i2 = 10;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            i2 = 11;
                            break;
                    }
                } else {
                    i2 = 12;
                }
                if (a2.get(String.valueOf(i2)) == null) {
                    a2.put(String.valueOf(i2), new ArrayList());
                }
                a2.get(String.valueOf(i2)).add(interactStickerStruct);
            }
        }
    }
}

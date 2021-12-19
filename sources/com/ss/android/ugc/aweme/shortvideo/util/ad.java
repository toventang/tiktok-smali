package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.i;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import h.f.b.l;
import java.util.Comparator;
import java.util.List;
import org.json.JSONObject;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static final a f132198a = new a((byte) 0);

    static {
        Covode.recordClassIndex(86571);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86572);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ad$a$a  reason: collision with other inner class name */
        public static final class C3431a<T> implements Comparator {
            static {
                Covode.recordClassIndex(86573);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                long j2;
                long j3;
                T t3 = t;
                l.b(t3, "");
                String segmentBeginTime = t3.getSegmentBeginTime();
                if (segmentBeginTime == null || segmentBeginTime.length() == 0) {
                    j2 = System.currentTimeMillis();
                } else {
                    String segmentBeginTime2 = t3.getSegmentBeginTime();
                    l.b(segmentBeginTime2, "");
                    j2 = Long.parseLong(segmentBeginTime2);
                }
                Long valueOf = Long.valueOf(j2);
                T t4 = t2;
                l.b(t4, "");
                String segmentBeginTime3 = t4.getSegmentBeginTime();
                if (segmentBeginTime3 == null || segmentBeginTime3.length() == 0) {
                    j3 = System.currentTimeMillis();
                } else {
                    String segmentBeginTime4 = t4.getSegmentBeginTime();
                    l.b(segmentBeginTime4, "");
                    j3 = Long.parseLong(segmentBeginTime4);
                }
                return h.b.a.a(valueOf, Long.valueOf(j3));
            }
        }

        public static void a(List<CreateAnchorInfo> list, i iVar) {
            String str;
            UrlModel iconUrl;
            List<String> urlList;
            UrlModel iconUrl2;
            List<String> urlList2;
            l.d(list, "");
            l.d(iVar, "");
            MvModel mvModel = iVar.mvInfo;
            String str2 = null;
            if (mvModel != null) {
                str = mvModel.getName();
                if (!(str == null || str.length() == 0)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("add_from", 1);
                        jSONObject.put("third_id", iVar.mvThemeId);
                        MvModel mvModel2 = iVar.mvInfo;
                        if (!(mvModel2 == null || (iconUrl = mvModel2.getIconUrl()) == null || (urlList = iconUrl.getUrlList()) == null)) {
                            if (!urlList.isEmpty()) {
                                MvModel mvModel3 = iVar.mvInfo;
                                if (!(mvModel3 == null || (iconUrl2 = mvModel3.getIconUrl()) == null || (urlList2 = iconUrl2.getUrlList()) == null)) {
                                    str2 = urlList2.get(0);
                                }
                                jSONObject.put("icon_url", str2);
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    String jSONObject2 = jSONObject.toString();
                    l.b(jSONObject2, "");
                    list.add(new CreateAnchorInfo(29, str, "", "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/20px_anchor_template3x.png", -1L, null, null, null, null, null, 3968, null));
                    return;
                }
            } else {
                str = null;
            }
            bj.a("[addMiscInfoAnchors] : keyword = ".concat(String.valueOf(str)));
        }

        /* JADX WARNING: Removed duplicated region for block: B:82:0x0195  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0198  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01f7  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x022c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r33, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r34) {
            /*
            // Method dump skipped, instructions count: 572
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.util.ad.a.a(java.util.List, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
        }
    }
}

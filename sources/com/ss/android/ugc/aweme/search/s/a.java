package com.ss.android.ugc.aweme.search.s;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.a.am;
import com.ss.android.ugc.aweme.discover.b.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.hl;
import h.a.n;
import h.f.b.m;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(79200);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.s.a$a  reason: collision with other inner class name */
    public static final class C3144a extends m implements h.f.a.a<String> {
        final /* synthetic */ Aweme $aweme;

        static {
            Covode.recordClassIndex(79201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3144a(Aweme aweme) {
            super(0);
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (a.c(this.$aweme)) {
                return "static";
            }
            return null;
        }
    }

    public static final class b extends m implements h.f.a.a<String> {
        final /* synthetic */ Aweme $aweme;

        static {
            Covode.recordClassIndex(79202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Aweme aweme) {
            super(0);
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String str;
            UrlModel aiDynamicCover;
            String uri;
            UrlModel aiDynamicCoverBak;
            String uri2;
            UrlModel d2 = a.d(this.$aweme);
            if (d2 != null) {
                str = d2.getUri();
            } else {
                str = null;
            }
            int a2 = h.a();
            if (a2 == 1) {
                return "dynamic_1";
            }
            if (a2 == 2) {
                Video video = this.$aweme.getVideo();
                if (video == null || (aiDynamicCover = video.getAiDynamicCover()) == null || (uri = aiDynamicCover.getUri()) == null || !uri.equals(str)) {
                    return "dynamic_3";
                }
                return "dynamic_1";
            } else if (a2 != 3) {
                return null;
            } else {
                Video video2 = this.$aweme.getVideo();
                if (video2 == null || (aiDynamicCoverBak = video2.getAiDynamicCoverBak()) == null || (uri2 = aiDynamicCoverBak.getUri()) == null || !uri2.equals(str)) {
                    return "dynamic_6";
                }
                return "dynamic_1";
            }
        }
    }

    public static final String a(Aweme aweme) {
        int totalProductAnchors;
        if (aweme == null || (totalProductAnchors = aweme.getTotalProductAnchors()) <= 0) {
            return "";
        }
        if (totalProductAnchors == 1) {
            return "search_video_single_anchor";
        }
        if (totalProductAnchors > 1) {
            return "search_video_multi_anchor";
        }
        return "";
    }

    public static final String b(Aweme aweme) {
        int totalProductAnchors;
        if (aweme == null || (totalProductAnchors = aweme.getTotalProductAnchors()) <= 0) {
            return "";
        }
        if (totalProductAnchors == 1) {
            return "yes";
        }
        if (totalProductAnchors > 1) {
            return "no";
        }
        return "";
    }

    public static final UrlModel d(Aweme aweme) {
        UrlModel animatedCover;
        if (aweme != null) {
            Video video = aweme.getVideo();
            if (video != null && (animatedCover = video.getAnimatedCover()) != null) {
                return animatedCover;
            }
            Video video2 = aweme.getVideo();
            if (video2 != null) {
                return video2.getDynamicCover();
            }
        }
        return null;
    }

    private static boolean a(UrlModel urlModel) {
        List<String> urlList;
        String str;
        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) n.h((List) urlList)) == null || !hl.a(str)) {
            return false;
        }
        return true;
    }

    public static final boolean c(Aweme aweme) {
        Video video;
        Video video2;
        if (!am.a() || aweme == null || (video = aweme.getVideo()) == null || video.getAiCover() == null || (video2 = aweme.getVideo()) == null || video2.isCustomCover()) {
            return false;
        }
        return true;
    }

    public static final boolean e(Aweme aweme) {
        UrlModel urlModel;
        Video video;
        Video video2;
        boolean a2 = a(d(aweme));
        UrlModel urlModel2 = null;
        if (aweme == null || (video2 = aweme.getVideo()) == null) {
            urlModel = null;
        } else {
            urlModel = video2.getAiDynamicCover();
        }
        boolean a3 = a(urlModel);
        if (!(aweme == null || (video = aweme.getVideo()) == null)) {
            urlModel2 = video.getAiDynamicCoverBak();
        }
        boolean a4 = a(urlModel2);
        if (a2 || a3 || a4) {
            return true;
        }
        return false;
    }
}

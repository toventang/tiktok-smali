package com.ss.android.ugc.aweme.ct;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.PreloadApiServiceImpl;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class c {
    static {
        Covode.recordClassIndex(49094);
    }

    public enum a {
        POST(new b() {
            /* class com.ss.android.ugc.aweme.ct.c.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(49096);
            }

            @Override // com.ss.android.ugc.aweme.ct.b
            public final Object a(Object[] objArr) {
                Aweme aweme = (Aweme) objArr[0];
                aweme.getAuthorUid();
                PreloadApiServiceImpl.a().a(aweme.getAuthorUid(), aweme.getAuthor().getSecUid(), a.a(aweme.getAid(), a.POST));
                return null;
            }
        }),
        PROFILE(new b() {
            /* class com.ss.android.ugc.aweme.ct.c.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(49097);
            }

            @Override // com.ss.android.ugc.aweme.ct.b
            public final Object a(Object[] objArr) {
                Aweme aweme = (Aweme) objArr[0];
                aweme.getAuthorUid();
                PreloadApiServiceImpl.a().a(aweme, a.a(aweme.getAid(), a.PROFILE));
                return null;
            }
        }),
        COMMENT(new b() {
            /* class com.ss.android.ugc.aweme.ct.c.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(49098);
            }

            @Override // com.ss.android.ugc.aweme.ct.b
            public final Object a(Object[] objArr) {
                Aweme aweme = (Aweme) objArr[0];
                aweme.getAuthorUid();
                CommentService e2 = CommentServiceImpl.e();
                String aid = aweme.getAid();
                a.a(aweme.getAid(), a.COMMENT);
                e2.a(aid, (String) objArr[1]);
                return null;
            }
        });
        
        private b preloader;

        public final b getPreloader() {
            return this.preloader;
        }

        static {
            Covode.recordClassIndex(49095);
        }

        private a(b bVar) {
            this.preloader = bVar;
        }
    }
}

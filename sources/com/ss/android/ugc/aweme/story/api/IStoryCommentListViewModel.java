package com.ss.android.ugc.aweme.story.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class IStoryCommentListViewModel extends DataCenter {

    /* renamed from: e  reason: collision with root package name */
    public static final a f136718e = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public Map<String, CommentItemList> f136719c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Integer> f136720d = new LinkedHashMap();

    static {
        Covode.recordClassIndex(89299);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89300);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}

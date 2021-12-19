package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class CleanPolicyModel {
    @c(a = "group_clean")
    public GroupCleanPolicy groupClean;
    @c(a = "specified_clean")
    public List<a> specifiedClean;

    public static class GroupCleanPolicy {
        @c(a = "limit")
        public int limit;
        @c(a = "policy")
        public int policy;
        @c(a = "rule")
        public int rule;

        static {
            Covode.recordClassIndex(17370);
        }
    }

    public class a {
        @c(a = "c")

        /* renamed from: a  reason: collision with root package name */
        public String f29939a;
        @c(a = "clean_type")

        /* renamed from: b  reason: collision with root package name */
        public int f29940b;
        @c(a = "version")

        /* renamed from: c  reason: collision with root package name */
        public List<Long> f29941c;
        @c(a = "status")

        /* renamed from: d  reason: collision with root package name */
        public int f29942d;
        @c(a = "pkg_id")

        /* renamed from: e  reason: collision with root package name */
        public int f29943e;
        @c(a = "err_code")

        /* renamed from: f  reason: collision with root package name */
        public int f29944f;
        @c(a = "err_msg")

        /* renamed from: g  reason: collision with root package name */
        public String f29945g;

        static {
            Covode.recordClassIndex(17371);
        }
    }

    static {
        Covode.recordClassIndex(17369);
    }
}

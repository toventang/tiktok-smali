package l.b;

import com.bytedance.covode.number.Covode;

public @interface h {
    static {
        Covode.recordClassIndex(105740);
    }

    String a();

    String b() default "";

    boolean c() default false;
}

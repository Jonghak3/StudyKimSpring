package hello.core.discount;

import hello.core.member.Member;

/**
 * @return  할인 대상 금액
 */
public interface DiscountPolicy {
    int dicount(Member member, int price);
}

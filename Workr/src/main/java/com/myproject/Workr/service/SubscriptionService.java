package com.myproject.Workr.service;

import com.myproject.Workr.domain.PlanType;
import com.myproject.Workr.model.Subscription;
import com.myproject.Workr.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}

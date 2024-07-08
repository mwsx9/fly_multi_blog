package com.jay.service.impl;

import com.jay.entity.Post;
import com.jay.dao.PostMapper;
import com.jay.service.PostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jay.xiang
 * @since 2018-10-29
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {



}

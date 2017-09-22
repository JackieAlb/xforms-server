INSERT INTO public.x_meta_kind(
	meta_kind_id, meta_kind_name, meta_kind_desc, meta_kind_parent_id)
	VALUES ('00000000000000000000000000000000', '业务要素分类', '根结点', '');

	
INSERT INTO public.x_users(
	user_id, user_name, password)
	VALUES ('formadmin', '表单管理员', 'kyPWTaSB1wc=');
	
INSERT INTO public.x_users(
	user_id, user_name, password)
	VALUES ('formuser', '表单管用户', 'kyPWTaSB1wc=');
	
	
commit;
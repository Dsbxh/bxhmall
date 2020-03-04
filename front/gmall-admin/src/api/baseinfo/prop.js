import request from '@/utils/request'

export default {

  // 根据三级分类id获取属性列表
  getAttrInfoList(catalogId) {
    return request({
      url: 'manager/attrInfoList?catalogId=' + catalogId,
      method: 'get'
    })
  },

  // 根据属性id获取属性值列表
  getAttrValueList(attrId) {
    return request({
      url: 'manager/getAttrValueList?attrId=' + attrId,
      method: 'get'
    })
  },

  // 保存属性
  saveAttrInfo(attrForm) {
    return request({
      url: 'manager/saveAttrInfo',
      method: 'post',
      data: attrForm
    })
  }
}

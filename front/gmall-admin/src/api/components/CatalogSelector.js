import request from '@/utils/request'

export default {

  // 查找一级分类
  getCatalog1() {
    return request({
      url: 'manager/getCatalog?catalogId=0',
      method: 'get'
    })
  },

  // 查找二级分类
  getCatalog2(catalog1Id) {
    return request({
      url: 'manager/getCatalog?catalogId=' + catalog1Id,
      method: 'get'
    })
  },

  // 查找三级分类
  getCatalog3(catalog2Id) {
    return request({
      url: 'manager/getCatalog?catalogId=' + catalog2Id,
      method: 'get'
    })
  }

}

import { EmsFrontendPage } from './app.po';

describe('ems-frontend App', function() {
  let page: EmsFrontendPage;

  beforeEach(() => {
    page = new EmsFrontendPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
